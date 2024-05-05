class Solution {
    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        int[] repeatCount = new int[s2.length() + 1];
        int[] nextIndex = new int[s2.length() + 1];
        int j = 0, count = 0;
    
        for (int k = 1; k <= n1; k++) {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    j++;
                    if (j == s2.length()) {
                        j = 0;
                        count++;
                    }
                }
            }
            repeatCount[k] = count;
            nextIndex[k] = j;
            for (int start = 0; start < k; start++) {
                if (nextIndex[start] == j) {
                    int prefixCount = repeatCount[start];
                    int patternCount = (n1 - start) / (k - start) * (repeatCount[k] - repeatCount[start]);
                    int suffixCount = repeatCount[start + (n1 - start) % (k - start)] - repeatCount[start];
                    return (prefixCount + patternCount + suffixCount) / n2;
                }
            }
        }
        return repeatCount[n1] / n2;
    }
}
