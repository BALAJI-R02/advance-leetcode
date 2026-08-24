class Solution {
    public int countEven(int num) {
        //int s=0;
        int c=0;
        for(int i=1;i<=num;i++){
            int n=i;
            int s=0;
            while(n!=0){
                int dig=n%10;
                s+=dig;
                n=n/10;
            }
            if(s%2==0)
            c++;
            
        }
        return c;
    }
}