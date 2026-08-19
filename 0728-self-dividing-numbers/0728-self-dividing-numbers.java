class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> str=new ArrayList<>();
        for(int i=left;i<=right;i++){
            int ele=i;
            while(ele!=0){
                int dig=ele%10;
                if(dig==0 || i%dig!=0)
                break;
                ele=ele/10;
            }
            if(ele==0)
            str.add(i);
        }
        return str;
    }
}