import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findSubstringInWraproundString(String s) {
        Map<String, Integer> substringCounts = new HashMap<>();
        int consecutiveCount = 0;
        int len = s.length();
        
        for (int i = 0; i < len; i++) {
            if (i > 0 && (s.charAt(i) - s.charAt(i - 1) == 1 || s.charAt(i - 1) - s.charAt(i) == 25)) {
                consecutiveCount++;
            } else {
                consecutiveCount = 1;
            }
            int index = s.charAt(i) - 'a';
            String substring = Character.toString((char) ('a' + index)) + consecutiveCount;
            substringCounts.put(substring, 1);
        }
        
        return substringCounts.size();
    }
}