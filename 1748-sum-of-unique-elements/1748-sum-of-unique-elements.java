class Solution {
    public int sumOfUnique(int[] nums) {
        int s=0;
        int op[]=new int[256];
        for(int a:nums){
            op[a]++;
        }
        for(int i=0;i<op.length;i++){
            if(op[i]==1)
            s+=i;
        }
        return s;
    }
}