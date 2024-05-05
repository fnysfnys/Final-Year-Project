import java.util.HashSet;
import java.util.Set;

class Solution {
    public int findSubstringInWraproundString(String s) {
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            int hash = s.charAt(i) - 'a';
            int j = i + 1;
            while (j < s.length() && (s.charAt(j) - s.charAt(j - 1) == 1 || s.charAt(j - 1) - s.charAt(j) == 25)) {
                hash = (hash + 1) % 26;
                hashSet.add(hash);
                j++;
            }
            hashSet.add(hash);
        }
        return hashSet.size();
    }
}
