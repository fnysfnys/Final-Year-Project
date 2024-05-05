import java.util.HashSet;
import java.util.Set;

class Solution {
    public int findSubstringInWraproundString(String s) {
        Set<String> substrings = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(i));
            int j = i + 1;
            while (j < s.length() && (s.charAt(j) - sb.charAt(sb.length() - 1) == 1 || sb.charAt(sb.length() - 1) - s.charAt(j) == 25)) {
                sb.append(s.charAt(j));
                substrings.add(sb.toString());
                j++;
            }
            substrings.add(sb.toString());
        }
        return substrings.size();
    }
}
