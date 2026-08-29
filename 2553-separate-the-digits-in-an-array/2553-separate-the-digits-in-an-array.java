class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> lst=new ArrayList<>();
        for(int a:nums){
            String s=Integer.toString(a);
            for(char ch:s.toCharArray())
            lst.add(ch-'0');
        }
        int arr[]=new int[lst.size()];
        for(int i=0;i<lst.size();i++){
            arr[i]=lst.get(i);
        }
        return arr;
    }
}