class Solution {
    public int findSubstringInWraproundString(String s) {
        int[] maxLength = new int[26];
        int len = s.length();
        
        for (int i = 0; i < len; i++) {
            if (i > 0 && (s.charAt(i) - s.charAt(i - 1) == 1 || s.charAt(i - 1) - s.charAt(i) == 25)) {
                maxLength[s.charAt(i) - 'a'] = Math.max(maxLength[s.charAt(i) - 'a'], maxLength[s.charAt(i - 1) - 'a'] + 1);
            } else {
                maxLength[s.charAt(i) - 'a'] = Math.max(maxLength[s.charAt(i) - 'a'], 1);
            }
        }
        
        int result = 0;
        for (int i : maxLength) {
            result += i;
        }
        
        return result;
    }
}