class Solution {
    public String reverseStr(String s, int k) {
        int size=k*2;
        char c[]=s.toCharArray();
        for(int i=0;i<c.length;i+=size){
            int a=i;
            int b=Math.min(i+k-1,c.length-1);
            while(a<b){
                char temp=c[a];
                c[a]=c[b];
                c[b]=temp;
                a++;
                b--;
            }
        }
        return new String(c);
    }
}