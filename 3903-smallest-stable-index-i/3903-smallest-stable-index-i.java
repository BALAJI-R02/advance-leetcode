class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int m=Integer.MAX_VALUE;
        int arr[]=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            m=Math.min(m,nums[i]);
            arr[i]=m;
        }
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            ans=Math.max(ans,nums[i]);
            int val=ans-arr[i];
            if(val<=k){
                return i;
            }
        }
        return -1;
    }
}