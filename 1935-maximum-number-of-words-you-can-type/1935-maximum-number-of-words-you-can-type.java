class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String arr[] = text.split(" ");
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr[i].length(); j++) {
                if (brokenLetters.indexOf(arr[i].charAt(j)) != -1) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                c++;
            }
        }
        return c;
    }
}