class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        int p1 = num1.indexOf('+');
        int p2 = num2.indexOf('+');
        int a = Integer.parseInt(num1.substring(0, p1));
        int b = Integer.parseInt(num1.substring(p1 + 1, num1.length() - 1));
        int c = Integer.parseInt(num2.substring(0, p2));
        int d = Integer.parseInt(num2.substring(p2 + 1, num2.length() - 1));
        int real = a * c - b * d;
        int imaginary = a * d + b * c;
        return real + "+" + imaginary + "i";
    }
}