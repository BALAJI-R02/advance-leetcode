class Solution {
    public long countCommas(long n) {
        long op=0;
        for(long i=1000;i<=n;i*=1000)
        {
            op+=n-i+1;
            if(i>n/1000)
            break;
        }
        return op;
    }
}