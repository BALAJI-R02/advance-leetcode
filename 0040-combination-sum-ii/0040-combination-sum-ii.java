class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }
    void solve(int[] arr, int target, int start,
               List<Integer> current,
               List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < arr.length; i++) {
            if (i > start && arr[i] == arr[i - 1]) 
                continue;
            if (arr[i] > target) 
                break;
            current.add(arr[i]);
            solve(arr, target - arr[i], i + 1, current, ans);
            current.remove(current.size() - 1);
        }
    }
}