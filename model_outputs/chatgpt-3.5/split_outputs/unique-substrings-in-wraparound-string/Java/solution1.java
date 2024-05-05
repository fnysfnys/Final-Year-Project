import java.util.HashSet;
import java.util.Set;

class Solution {
    public int findSubstringInWraproundString(String s) {
        Set<String> substrings = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String substring = s.substring(i, j);
                if (isSubstringInWraproundString(substring)) {
                    substrings.add(substring);
                }
            }
        }
        return substrings.size();
    }

    private boolean isSubstringInWraproundString(String s) {
        for (int i = 1; i < s.length(); i++) {
            if ((s.charAt(i) - s.charAt(i - 1) + 26) % 26 != 1) {
                return false;
            }
        }
        return true;
    }
}
