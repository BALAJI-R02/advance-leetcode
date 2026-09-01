class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> l=new ArrayList<>();
            int value=1;
        for(int j=0;j<=i;j++){
            
            l.add(value);
            value=value*(i-j)/(j+1);
        }
        list.add(l);
        }
        return list;
    }
}