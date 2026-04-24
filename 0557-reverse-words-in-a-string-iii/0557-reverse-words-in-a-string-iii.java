class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder last = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            last.append(reversedWord).append(" ");
        }
        last.deleteCharAt(last.length() - 1); 
        return last.toString();        
    }
}