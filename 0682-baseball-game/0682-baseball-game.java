class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        for(String a:operations){
            if(a.equals("C"))
            stack.pop();
            else if(a.equals("D"))
            stack.push(stack.peek()*2);
            else if(a.equals("+")){
                int l=stack.pop();
                int sl=stack.peek();
                stack.push(l);
                stack.push(l+sl);
            }
            else
            stack.push(Integer.parseInt(a));
        }
        int op=0;
        for(int b:stack)
        op+=b;
        return op;
    }
}