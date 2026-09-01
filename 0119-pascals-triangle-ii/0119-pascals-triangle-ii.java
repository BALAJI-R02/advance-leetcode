class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> l=new ArrayList<>();
        for(int i=rowIndex;i<=rowIndex;i++){
            long value=1;
            for(int j=0;j<=i;j++){
                l.add((int) value);
                value=value*(i-j)/(j+1);
            }
        }
        return l;
    }
}