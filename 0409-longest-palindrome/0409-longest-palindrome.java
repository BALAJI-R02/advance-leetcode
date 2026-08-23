class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int oc=0;
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.get(ch)%2==1)
            oc++;
            else
            oc--;
        }
        if(oc>1)
        return s.length()-oc+1;
        return s.length();
    }
}