public int numDistinct(String s, String t) {
    return numDistinctHelper(s, t, 0, 0);
}

private int numDistinctHelper(String s, String t, int i, int j) {
    if (j == t.length()) return 1;
    if (i == s.length()) return 0;
    
    if (s.charAt(i) == t.charAt(j)) {
        return numDistinctHelper(s, t, i + 1, j + 1) + numDistinctHelper(s, t, i + 1, j);
    } else {
        return numDistinctHelper(s, t, i + 1, j);
    }
}
