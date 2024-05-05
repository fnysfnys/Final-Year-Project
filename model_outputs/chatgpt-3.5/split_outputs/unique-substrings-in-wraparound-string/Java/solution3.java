import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findSubstringInWraproundString(String s) {
        Map<Character, Integer> maxLengthEndingHere = new HashMap<>();
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && (s.charAt(i) - s.charAt(i - 1) == 1 || s.charAt(i - 1) - s.charAt(i) == 25)) {
                maxLen++;
            } else {
                maxLen = 1;
            }
            maxLengthEndingHere.put(s.charAt(i), Math.max(maxLengthEndingHere.getOrDefault(s.charAt(i), 0), maxLen));
        }
        int sum = 0;
        for (int len : maxLengthEndingHere.values()) {
            sum += len;
        }
        return sum;
    }
}
