public int numDistinct(String s, String t) {
    Integer[][] memo = new Integer[s.length()][t.length()];
    return numDistinctHelper(s, t, 0, 0, memo);
}

private int numDistinctHelper(String s, String t, int i, int j, Integer[][] memo) {
    if (j == t.length()) return 1;
    if (i == s.length()) return 0;
    if (memo[i][j] != null) return memo[i][j];
    
    int count = 0;
    if (s.charAt(i) == t.charAt(j)) {
        count = numDistinctHelper(s, t, i + 1, j + 1, memo) + numDistinctHelper(s, t, i + 1, j, memo);
    } else {
        count = numDistinctHelper(s, t, i + 1, j, memo);
    }
    memo[i][j] = count;
    return count;
}
