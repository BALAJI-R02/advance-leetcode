class Solution {
    public String sortSentence(String s) {
        String[] words = s.split("\\s+");
        String[] sorted = new String[words.length];
        for (String word : words) {
            int n = word.length();
            int i = word.charAt(n - 1) - '0' - 1;
            sorted[i] = word.substring(0, n - 1);
        }
        return String.join(" ", sorted);
    }
}