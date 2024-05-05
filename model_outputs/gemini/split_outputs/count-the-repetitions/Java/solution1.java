public class Solution {
    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        int count = 0;
        for (int i = 0; i < n1 * s1.length(); i++) {
            for (int j = 0; j < s2.length() && i < n1 * s1.length(); j++) {
                if (s1.charAt(i % s1.length()) == s2.charAt(j)) {
                    count++;
                }
            }
        }
        return count / n2;
    }
}
