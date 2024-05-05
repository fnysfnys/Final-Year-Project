class Solution {
    public int findSubstringInWraproundString(String s) {
        StringBuilder substring = new StringBuilder();
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
            substring.append(s.charAt(i));
            maxCount = Math.max(maxCount, currentCount);
        }
        
        return substring.toString().chars().distinct().count();
    }
}