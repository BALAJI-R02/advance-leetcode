class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        List<Integer> lst=new ArrayList<>();
        for(int a:nums){
            if(hs.contains(a)){
                lst.add(a);
            }
            hs.add(a);
        }
        return lst;
    }
}