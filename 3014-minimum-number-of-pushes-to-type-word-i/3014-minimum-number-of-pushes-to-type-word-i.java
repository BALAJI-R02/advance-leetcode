class Solution {
    public int minimumPushes(String word) {
        int ans=0;
        int push=1;
        int kw=0;
        for(int i=0;i<word.length();i++){
            ans+=push;
            kw++;
            if(kw==8){
                push++;
                kw=0;
            }
        }
        return ans;
    }
}