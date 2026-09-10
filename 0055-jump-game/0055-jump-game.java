class Solution {
    public boolean canJump(int[] nums) {
        int op=0;
        for(int i=0;i<nums.length;i++){
            if(i>op)
            return false;
            op=Math.max(op,i+nums[i]);
        }
        return true;
    }
}