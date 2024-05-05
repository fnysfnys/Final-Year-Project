import java.util.HashSet;
import java.util.Set;

class Solution {
    public int findSubstringInWraproundString(String s) {
        Set<String> substrings = new HashSet<>();
        int[] maxLength = new int[26];
        int len = s.length();
        int consecutiveCount = 0;
        
        for (int i = 0; i < len; i++) {
            if (i > 0 && (s.charAt(i) - s.charAt(i - 1) == 1 || s.charAt(i - 1) - s.charAt(i) == 25)) {
                consecutiveCount++;
            } else {
                consecutiveCount = 1;
            }
            int index = s.charAt(i) - 'a';
            maxLength[index] = Math.max(maxLength[index], consecutiveCount);
        }
        
        for (int i = 0; i < 26; i++) {
            for (int j = 1; j <= maxLength[i]; j++) {
                substrings.add(Character.toString((char) ('a' + i)) + j);
            }
        }
        
        return substrings.size();
    }
}