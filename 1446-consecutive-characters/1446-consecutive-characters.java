class Solution {
    public int maxPower(String s) {
        int count=0;
        int max=0;
        int count1=0;
        char c[]=s.toCharArray();
        for(int i=0;i<c.length;i+=count1){
            count=0;
            for(int j=i;j<c.length;j++){
                if(c[i]==c[j])
                count++;
                else
                break;
            }
            if(max<count)
            max=count;
            count1=count;
        }
        return max;
    }
}