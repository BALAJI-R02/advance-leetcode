class Solution {
    public int maxRotateFunction(int[] nums) {
        long s = 0;
        long q = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            s += nums[i];
            q += (long) i * nums[i];
        }
        long max = q;
        for (int i = 1; i < len; i++) {
            q += s - (long) len * nums[len - i];
            max = Math.max(max, q);
        }
        return (int) max;
    }
}