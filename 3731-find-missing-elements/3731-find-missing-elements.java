class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> lst=new ArrayList<>();
        int a=nums[0];
        for(int i=0;i<nums.length;i++){
            while(a<nums[i]){
            lst.add(a);
            a++;
            }
            a++;
        }
        return lst;
    }
}