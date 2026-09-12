class Solution {
    public String minWindow(String s, String t) {
        int freq[]=new int[128];
        for(char c:t.toCharArray())
        freq[c]++;
        int l=0;
        int min=s.length()+1;
        int start=0;
        int count=t.length();
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            if(freq[c]>0){
                count--;
            }
            freq[c]--;
            while(count==0){
                if(r-l+1<min){
                    min=r-l+1;
                    start=l;
                }
                char x=s.charAt(l);
                freq[x]++;
                if(freq[x]>0)
                count++;
                l++;
            }
        } 
        if(min==s.length()+1)
        return "";
        else
        return s.substring(start,start+min);
    }
}