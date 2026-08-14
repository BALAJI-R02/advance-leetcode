class Solution {
    public int arrangeCoins(int n) {
        int c=0;
        int i=1;
        if(n==1)
        return n;
        while(n>0){
        n=n-i;
        i++;
        if(n==0){
            c++;
        }
        c++;
        }
        return c-1;
    }
}