class Solution {
    public int[] numberOfPairs(int[] nums) {
        Arrays.sort(nums);
        int pairs = 0;
        for(int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1]) {
                pairs++;
                i++;
            }
        }
        return new int[]{pairs, nums.length-(pairs*2)};
    }
}