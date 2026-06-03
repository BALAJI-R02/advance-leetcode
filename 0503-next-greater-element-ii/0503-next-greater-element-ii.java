class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = -1; 
            for (int step = 1; step < n; step++) {
                int index = (i + step) % n;
                if (nums[index] > nums[i]) {
                    arr[i] = nums[index];
                    break; 
                }
            }
        }
        return arr;
    }
}