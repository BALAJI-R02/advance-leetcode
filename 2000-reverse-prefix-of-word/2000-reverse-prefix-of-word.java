class Solution {
    public String reversePrefix(String word, char ch) {
        String res="";
        //String op="";
        //int t=-1;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                res+=word.substring(0,i+1);
                StringBuilder rev=new StringBuilder(res);
                rev.reverse();
                String op=word.substring(i+1);
            return rev.toString()+op;
            }
        }
        return word;
    }
}