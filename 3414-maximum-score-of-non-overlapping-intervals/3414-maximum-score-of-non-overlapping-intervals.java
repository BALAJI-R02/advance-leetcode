import java.util.*;

class Solution {
    public int[] maximumWeight(List<List<Integer>> intervals) {

        int n = intervals.size();

        int[][] arr = new int[n][4];

        for (int i = 0; i < n; i++) {
            arr[i][0] = intervals.get(i).get(0);
            arr[i][1] = intervals.get(i).get(1);
            arr[i][2] = intervals.get(i).get(2);
            arr[i][3] = i;
        }

        Arrays.sort(arr, (a, b) -> {
            if (a[1] != b[1])
                return Integer.compare(a[1], b[1]);

            return Integer.compare(a[0], b[0]);
        });

        int[] previous = new int[n];

        for (int i = 0; i < n; i++) {
            int low = 0;
            int high = i - 1;
            int pos = -1;

            while (low <= high) {
                int mid = (low + high) / 2;

                if (arr[mid][1] < arr[i][0]) {
                    pos = mid;
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            previous[i] = pos;
        }

        List<Integer>[][] dp = new ArrayList[5][n + 1];

        for (int k = 0; k <= 4; k++) {
            for (int i = 0; i <= n; i++) {
                dp[k][i] = new ArrayList<>();
            }
        }

        long[][] value = new long[5][n + 1];

        for (int i = 1; i <= n; i++) {

            int index = i - 1;

            for (int k = 0; k <= 4; k++) {

                // Don't take current interval
                value[k][i] = value[k][i - 1];
                dp[k][i] = new ArrayList<>(dp[k][i - 1]);

                // Take current interval
                if (k > 0) {

                    int p = previous[index] + 1;

                    long take = value[k - 1][p] + arr[index][2];

                    List<Integer> temp =
                        new ArrayList<>(dp[k - 1][p]);

                    temp.add(arr[index][3]);

                    Collections.sort(temp);

                    if (take > value[k][i] ||
                        (take == value[k][i] &&
                         compare(temp, dp[k][i]) < 0)) {

                        value[k][i] = take;
                        dp[k][i] = temp;
                    }
                }
            }
        }

        List<Integer> result = dp[4][n];

        // We need the best among at most 4 intervals
        for (int k = 1; k < 4; k++) {

            if (value[k][n] > value[4][n] ||
                (value[k][n] == value[4][n] &&
                 compare(dp[k][n], dp[4][n]) < 0)) {

                result = dp[k][n];
            }
        }

        int[] ans = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }

    int compare(List<Integer> a, List<Integer> b) {

        int n = Math.min(a.size(), b.size());

        for (int i = 0; i < n; i++) {
            if (!a.get(i).equals(b.get(i))) {
                return Integer.compare(a.get(i), b.get(i));
            }
        }

        return Integer.compare(a.size(), b.size());
    }
}