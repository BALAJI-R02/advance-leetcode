class Solution {
    public int findLucky(int[] arr) {
        
        int max=0;
        for(int i=0;i<arr.length;i++){
            int c=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j])
                c++;
            }
            if(c==arr[i]){
                if(max<c){
                max=arr[i];
                }
            }

        }
        if(max!=0){
            return max;
        }
        return -1;
    }
}