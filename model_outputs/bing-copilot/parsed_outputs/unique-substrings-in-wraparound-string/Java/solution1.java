class Solution {
    public int findSubstringInWraproundString(String s) {
        Set<String> substrings = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String substring = s.substring(i, j + 1);
                if (isWraparound(substring)) {
                    substrings.add(substring);
                }
            }
        }
        return substrings.size();
    }
    
    private boolean isWraparound(String s) {
        for (int i = 1; i < s.length(); i++) {
            int diff = s.charAt(i) - s.charAt(i - 1);
            if (diff != 1 && diff != -25) {
                return false;
            }
        }
        return true;
    }
    
}
