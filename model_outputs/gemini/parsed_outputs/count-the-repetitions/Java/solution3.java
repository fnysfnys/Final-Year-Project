public class Solution {
    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        int[] lps = new int[s2.length()];
        computeLPSArray(s2, lps);

        int i = 0, j = 0, count = 0;
        while (i < n1 * s1.length()) {
            if (s1.charAt(i % s1.length()) == s2.charAt(j)) {
                j++;
                if (j == s2.length()) {
                    count++;
                    j = lps[j - 1];
                }
            } else {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
            i++;
        }
        return count / n2;
    }

    private void computeLPSArray(String pat, int[] lps) {
        int len = 0, i = 1;
        while (i < pat.length()) {
            if (pat.charAt(i) == pat.charAt(len)) {
                lps[i] = len + 1;
                len++;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }
}
