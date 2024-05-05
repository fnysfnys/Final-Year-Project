import java.util.HashSet;
import java.util.Set;

class Solution {
    public int findSubstringInWraproundString(String s) {
        Set<String> substrings = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            int j = i + 1;
            while (j < s.length() && (s.charAt(j) - s.charAt(j - 1) == 1 || s.charAt(j - 1) - s.charAt(j) == 25)) {
                j++;
            }
            for (int k = i; k < j; k++) {
                substrings.add(s.substring(i, k + 1));
            }
        }
        return substrings.size();
    }
}
