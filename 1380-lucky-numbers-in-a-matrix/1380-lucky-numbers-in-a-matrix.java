class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int row[]=new int[matrix.length];
        int col[]=new int[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            int minr=Integer.MAX_VALUE;
            for(int j=0;j<matrix[0].length;j++){
                if(minr>matrix[i][j])
                minr=matrix[i][j];
            }
            row[i]=minr;
        }
        for(int j=0;j<matrix[0].length;j++){
            int maxc=Integer.MIN_VALUE;
            for(int i=0;i<matrix.length;i++){
                if(maxc<matrix[i][j])
                maxc=matrix[i][j];
            }
            col[j]=maxc;
        }
        for(int i=0;i<row.length;i++)
        {
            for(int j=0;j<col.length;j++){
                if(row[i]==col[j])
                list.add(row[i]);
            }
        }
        return list;
    }
}