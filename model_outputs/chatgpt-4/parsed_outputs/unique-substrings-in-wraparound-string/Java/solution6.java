class Solution {
    public int findSubstringInWraproundString(String s) {
        HashSet<String> uniqueSubstrings = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i, len = 0; j < s.length() && (j == i || (s.charAt(j) - s.charAt(j - 1) == 1 || s.charAt(j - 1) - s.charAt(j) == 25)); j++) {
                len++;
                uniqueSubstrings.add(s.substring(i, i + len));
            }
        }

        return uniqueSubstrings.size();
    }
}