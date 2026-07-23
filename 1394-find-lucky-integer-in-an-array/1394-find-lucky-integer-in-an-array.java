class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        int max=0;
        int count1=0;
        for(int i=0;i<arr.length;i+=count1){
            int count=0;
            for(int j=i;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==arr[i]){
                if(max<count){
                    max=arr[i];
                }
            }
            count1=count;
        }
        if(max==0){
            return-1;
        }
        return max;
    }
}