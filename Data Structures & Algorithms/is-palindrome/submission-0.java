class Solution {
    public boolean isPalindrome(String s) {

        String str = "";
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                str += Character.toLowerCase(c);
            }
        }
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        return str.equals(reverse);
    }
}