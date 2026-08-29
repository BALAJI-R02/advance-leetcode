class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String res="";
        for(String k:word1)
        res+=k;
        String op="";
        for(String k:word2)
        op+=k;
        if(res.equals(op))
        return true;
        return false;
    }
}