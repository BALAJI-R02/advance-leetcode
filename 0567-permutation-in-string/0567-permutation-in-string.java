class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int a=s1.length();
        int b=s2.length();
        if(b<a)
        return false;
        char arr[]=s1.toCharArray();
        Arrays.sort(arr);
        for(int i=0;i<=b-a;i++){
            String res=s2.substring(i,i+a);
            char arr1[]=res.toCharArray();
            Arrays.sort(arr1);
            if(Arrays.equals(arr,arr1))
            return true;

        }
        return false;
    }
}