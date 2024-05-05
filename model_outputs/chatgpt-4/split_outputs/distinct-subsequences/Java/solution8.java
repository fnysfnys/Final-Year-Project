public int numDistinct(String s, String t) {
    char[] sArr = s.toCharArray();
    char[] tArr = t.toCharArray();
    return numDistinctHelper(sArr, tArr, 0, 0);
}

private int numDistinctHelper(char[] s, char[] t, int i, int j) {
    if (j == t.length) return 1;
    if (i == s.length) return 0;
    
    int count = numDistinctHelper(s, t, i + 1, j);
    if (s[i] == t[j]) {
        count += numDistinctHelper(s, t, i + 1, j + 1);
    }
    return count;
}
