class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int arr[][]=new int[image.length][image[0].length];
        int b=0;
        for(int i=0;i<image.length;i++){
            b=0;
            for(int j=image[0].length-1;j>=0;j--){
                arr[i][b]=image[i][j];
                b++;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0)
                arr[i][j]=1;
                else
                arr[i][j]=0;
            }
        }
        return arr;
    }
}