class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X=0;
        String c="";
        int q=0;
        for(int i=0;i<operations.length;i++){
            c=operations[i];
            if(c.equals("++X"))
            ++X;
            else if(c.equals("X++"))
            X++;
            else if(c.equals("X--"))
            X--;
            else
            --X;
        }
        return X;
    }
}