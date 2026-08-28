class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        int c = 0;
        int a = nums.length;

        for (int i = 0; i < a; i++) {

            int prod = 1;

            for (int j = i; j < a; j++) {

                prod = prod * nums[j];

                if (prod < k)
                    c++;
                else
                    break;
            }
        }

        return c;
    }
}