public int numDistinct(String s, String t) {
    int m = s.length(), n = t.length();
    int[][] memo = new int[m + 1][n + 1];

    return helper(s, t, 0, 0, memo);
}

private int helper(String s, String t, int i, int j, int[][] memo) {
    if (j == t.length()) {
        return 1; // base case: found entire t in s
    }
    if (i == s.length()) {
        return 0; // base case: no more chars in s
    }
    if (memo[i][j] != 0) {
        return memo[i][j];
    }

    int res = 0;
    if (s.charAt(i) == t.charAt(j)) {
        res += helper(s, t, i + 1, j + 1, memo); // include current char in s
    }
    res += helper(s, t, i + 1, j, memo); // exclude current char in s

    memo[i][j] = res;
    return res;
}
