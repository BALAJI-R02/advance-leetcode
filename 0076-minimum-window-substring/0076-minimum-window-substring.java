class Solution {
    public String minWindow(String s, String t) {
        int freq[]=new int[128];
        for(char c:t.toCharArray())
        freq[c]++;
        int count=t.length();
        int min=s.length()+1;
        int left=0;
        int start=0;
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            if(freq[c]>0){
                count--;
            }
            freq[c]--;
            while(count==0){
                if(right-left+1<min){
                    min=right-left+1;
                    start=left;
                }
                char x=s.charAt(left);
                freq[x]++;
                if(freq[x]>0){
                    count++;
                }
                left++;
            }
        }
        if(min==s.length()+1)
        return "";
        else
        return s.substring(start,start+min); 
    }
}