class Solution {
    public String convertDateToBinary(String date) {
        String year=date.substring(0,4);
        String mon=date.substring(5,7);
        String dat=date.substring(8,10);
        int y=Integer.parseInt(year);
        int m=Integer.parseInt(mon);
        int d=Integer.parseInt(dat);
        String ans="";
        String by=Integer.toBinaryString(y);
        ans+=by+"-";
        String bm=Integer.toBinaryString(m);
        ans+=bm+"-";
        String bd=Integer.toBinaryString(d);
        ans+=bd;
        return ans;
    }
}