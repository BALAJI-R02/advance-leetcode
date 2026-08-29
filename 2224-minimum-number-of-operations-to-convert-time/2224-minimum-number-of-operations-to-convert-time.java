class Solution {
    public int convertTime(String current, String correct) {
        String cur[]=current.split(":");
        String cor[]=correct.split(":");
        int cu=Integer.parseInt(cur[0])*60+Integer.parseInt(cur[1]);
        int cr=Integer.parseInt(cor[0])*60+Integer.parseInt(cor[1]);
        int c=0;
        while(cu+60<=cr)
        {
            c++;
            cu+=60;
        }
        while(cu+15<=cr)
        {
            c++;
            cu+=15;
        }
        while(cu+5<=cr)
        {
            c++;
            cu+=5;
        }
        while(cu+1<=cr)
        {
            c++;
            cu+=1;
        }
        return c;
    }
}