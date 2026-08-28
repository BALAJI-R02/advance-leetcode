class Solution {
    public long sumAndMultiply(int n) {
        int x=0;
        int s=0;
        String res=Integer.toString(n);
        for(int i=0;i<res.length();i++){
            int dig=res.charAt(i)-'0';
            if(dig!=0)
            x=x*10+dig;
            s+=dig;
        }
        return (long) x*s;
    }
}