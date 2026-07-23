class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder str = new StringBuilder();
        int c=0;
        while(str.length()<b.length()){
            str.append(a);
            c++;
            if(str.toString().contains(b))
            return c;
        }
        str.append(a);
        c++;
        if(str.toString().contains(b)){
        return c;
        }
        return -1;
    }
}