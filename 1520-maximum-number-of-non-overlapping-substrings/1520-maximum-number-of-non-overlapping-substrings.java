class Solution {

    public List<String> maxNumOfSubstrings(String s) {

        int n = s.length();

        int[] first = new int[26];
        int[] last = new int[26];

        Arrays.fill(first, -1);
        for (int i = 0; i < n; i++) {

            int index = s.charAt(i) - 'a';

            if (first[index] == -1) {
                first[index] = i;
            }

            last[index] = i;
        }

        List<int[]> intervals = new ArrayList<>();
        for (int c = 0; c < 26; c++) {

            if (first[c] == -1) {
                continue;
            }

            int start = first[c];
            int end = last[c];

            boolean valid = true;

            for (int i = start; i <= end; i++) {

                int current = s.charAt(i) - 'a';

                if (first[current] < start) {
                    valid = false;
                    break;
                }

                end = Math.max(end, last[current]);
            }

            if (valid) {
                intervals.add(new int[]{start, end});
            }
        }
        Collections.sort(intervals, (a, b) -> a[1] - b[1]);

        List<String> answer = new ArrayList<>();

        int lastEnd = -1;

        for (int[] interval : intervals) {

            if (interval[0] > lastEnd) {

                answer.add(
                    s.substring(interval[0], interval[1] + 1)
                );

                lastEnd = interval[1];
            }
        }
        return answer;
    }
}