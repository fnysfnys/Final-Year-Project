import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findSubstringInWraproundString(String s) {
        Map<String, Integer> substrings = new HashMap<>();
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
            String substring = Character.toString((char) ('a' + index)) + currentCount;
            substrings.put(substring, 1);
            maxCount = Math.max(maxCount, currentCount);
        }
        
        return substrings.size();
    }
}