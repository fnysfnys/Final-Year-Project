public class Solution {
    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        int i = 0, j = 0, count = 0;
        while (i < n1 * s1.length()) {
            if (s1.charAt(i % s1.length()) == s2.charAt(j)) {
                j++;
                if (j == s2.length()) {
                    count++;
                    j = 0;
                }
            }
            i++;
        }
        return count / n2;
    }
}
