class Solution {
    public String decodeMessage(String key, String message) {
        char arr[]=new char[26];
        int i=0;
        for(char ch:key.toCharArray())
        {
            if(ch!=' ' && arr[ch-'a']=='\0')
            {
                arr[ch-'a']=(char)('a'+i);
                i++;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char c:message.toCharArray())
        {
            if(c!=' ')
            {
                sb.append(arr[c-'a']);
            }
            else
            {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}