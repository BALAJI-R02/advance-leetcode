class Solution {
    public boolean checkDivisibility(int n) {
        int s=0;
        int q=n;
        int pro=1;
        int ans=0;
        while(n!=0){
            int dig=n%10;
            s+=dig;
            pro*=dig;
            n=n/10;
        }
        return q%(s+pro)==n;
    }
}