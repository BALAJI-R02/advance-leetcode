class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxsum = Integer.MIN_VALUE;
        double avg = 0;
        for (int i = 0; i <= nums.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) 
                sum += nums[j];
            if (sum > maxsum) {
                maxsum = sum;
                avg = (double) maxsum / k;
            }
        }
        return avg;
    }
}