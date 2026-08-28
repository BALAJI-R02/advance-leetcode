class Solution {
    public int alternateDigitSum(int n) {
        String res=Integer.toString(n);
        int s=0;
        for(int i=0;i<res.length();i++){
            int  dig=res.charAt(i)-'0';
            if(i%2==0)
            s+=dig;
            else
            s-=dig;
        }
        return s;
    }
}