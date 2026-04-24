class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] indexofs = new int[256]; 
        int[] indexoft = new int[256];
        if(s.length() != t.length()) {
            return false;
        }
        for(int i = 0; i < t.length(); i++) {
            if(indexofs[s.charAt(i)] != indexoft[t.charAt(i)])  
                return false; 
            indexofs[s.charAt(i)] = i + 1; 
            indexoft[t.charAt(i)] = i + 1;
        }
        return true;
    }
}
