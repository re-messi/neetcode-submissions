class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int halflength = s.length() / 2;
        String half1 = s.substring(0, halflength);
        String half2 = new StringBuilder(s.substring(s.length() - halflength)).reverse().toString();

        if (half1.equals(half2))
            return true;
        return false;
    }
}
