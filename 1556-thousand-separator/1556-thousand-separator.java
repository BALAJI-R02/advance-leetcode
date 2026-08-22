class Solution {
    public String thousandSeparator(int n) {
        String sb=Integer.toString(n);
        if(sb.length()<4)
        return sb;
        String str="";
        int c=-1;
        for(int i=sb.length()-1;i>=0;i--){
            c++;
            if(c%3==0){
                str+=".";
                str+=sb.charAt(i);
            }
            else
            str+=sb.charAt(i);
        }
        String q=str.substring(1,str.length());
        StringBuilder w=new StringBuilder(q);
        return w.reverse().toString();
    }
}
