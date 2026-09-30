class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        for (int i = 0; i < s.length(); i++) {
            boolean found = false;
            for (int j = 0; j < t.length(); j++) {
                if (s.substring(i, i + 1).equals(t.substring(j, j + 1))) {
                    String front = t.substring(0, j);
                    String back = t.substring(j + 1);
                    t = front + back;
                    found = true;
                    break;
                }
            }
            if (!found) return false;
        }
        return t.length() == 0;
    }
}