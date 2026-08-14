class Solution {
    public String removeTrailingZeros(String num) {
        int a=num.length()-1;
        while(a>=0 && num.charAt(a)=='0')
        a--;
        return num.substring(0,a+1);
    }
}