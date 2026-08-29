class Solution {
    public boolean halvesAreAlike(String s) {
        String vow = "aeiouAEIOU";
        int c = 0;
        int c2 = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            if (vow.indexOf(s.charAt(i)) != -1) 
                c++;
        }
        for (int i = s.length() / 2; i < s.length(); i++) {
            if (vow.indexOf(s.charAt(i)) != -1) 
                c2++;
        }
        if(c==c2)
        return true;
        return false;
    }
}