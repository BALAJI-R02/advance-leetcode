class Solution {
    public String truncateSentence(String s, int k) {
        String arr[]=s.split(" ");
        String [] str=new String[k];
        for(int i=0;i<k;i++){
            str[i]=arr[i];
        }
        String res=String.join(" ",str);
        return res;
    }
}