class Solution {
    public int countSegments(String s) {
        int c=0;
        String str[]=s.split(" ");
        for(String q:str){
            if(!q.isEmpty())
            c++;
        }
        return c;
    }
}