class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res="";
        //int c= word1.length()+word2.length();
        int min=Math.min(word1.length(),word2.length());
        for(int i=0;i<min;i++){
            res+=word1.charAt(i);
            res+=word2.charAt(i);
        }
        res+=word1.substring(min);
        res+=word2.substring(min);
        return res;
    }
}