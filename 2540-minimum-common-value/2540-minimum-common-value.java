class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> hs=new HashSet<>();
        for(int a:nums1){
            hs.add(a);
        }
        for(int a:nums2){
            if(hs.contains(a))
            return a;
        }
        return -1;
    }
}