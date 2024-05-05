class Solution {
    public int findSubstringInWraproundString(String s) {
        StringBuilder substring = new StringBuilder();
        int len = s.length();
        
        for (int i = 0; i < len; i++) {
            if (i > 0 && (s.charAt(i) - s.charAt(i - 1) == 1 || s.charAt(i - 1) - s.charAt(i) == 25)) {
                substring.append(s.charAt(i));
            } else {
                substring = new StringBuilder(Character.toString(s.charAt(i)));
            }
        }
        
        return substring.toString().chars().distinct().count();
    }
}