class Solution {
    public int findSubstringInWraproundString(String s) {
        boolean[] substrings = new boolean[26];
        int consecutiveCount = 0;
        int len = s.length();
        
        for (int i = 0; i < len; i++) {
            if (i > 0 && (s.charAt(i) - s.charAt(i - 1) == 1 || s.charAt(i - 1) - s.charAt(i) == 25)) {
                consecutiveCount++;
            } else {
                consecutiveCount = 1;
            }
            int index = s.charAt(i) - 'a';
            substrings[index] = true;
        }
        
        int result = 0;
        for (boolean b : substrings) {
            if (b) {
                result++;
            }
        }
        
        return result;
    }
}