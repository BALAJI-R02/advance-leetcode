class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int a=grid.length;
        int size=a*a;
        int [] freq=new int[size+1];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                freq[grid[i][j]]++;
            }
        }
        int re=-1;
        int mi=-1;
        for(int i=1;i<=size;i++){
            if(freq[i]==2)
            re=i;
            if(freq[i]==0)
            mi=i;
        }
        return new int[]{re,mi};
    }
}