class Solution {
    public int findSubstringInWraproundString(String s) {
        boolean[] isSubstring = new boolean[26];
        int maxCount = 0;
        int currentCount = 0;
        int len = s.length();
        
        for (int i = 0; i < len; i++) {
            if (i > 0 && (s.charAt(i) - s.charAt(i - 1) == 1 || s.charAt(i - 1) - s.charAt(i) == 25)) {
                currentCount++;
            } else {
                currentCount = 1;
            }
            int index = s.charAt(i) - 'a';
            isSubstring[index] = true;
            maxCount = Math.max(maxCount, currentCount);
        }
        
        int result = 0;
        for (boolean b : isSubstring) {
            if (b) {
                result++;
            }
        }
        
        return result;
    }
}