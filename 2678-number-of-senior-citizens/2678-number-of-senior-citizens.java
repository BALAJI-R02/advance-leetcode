class Solution {
    public int countSeniors(String[] details) {
        int c=0;
        for(int i=0;i<details.length;i++){
            String res=details[i];
            String op=res.substring(11,13);
            int age=Integer.parseInt(op);
            if(age>60)
            c++;
        }
        return c;
    }
}