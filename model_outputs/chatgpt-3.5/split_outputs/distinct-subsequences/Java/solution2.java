public int numDistinct(String s, String t) {
    int m = s.length();
    int n = t.length();
    int[][] memo = new int[m + 1][n + 1];
    return countDistinctSubsequences(s, t, m, n, memo);
}

private int countDistinctSubsequences(String s, String t, int m, int n, int[][] memo) {
    if (n == 0) {
        return 1;
    }
    if (m == 0) {
        return 0;
    }

    if (memo[m][n] != 0) {
        return memo[m][n];
    }

    int result = 0;
    if (s.charAt(m - 1) == t.charAt(n - 1)) {
        result += countDistinctSubsequences(s, t, m - 1, n - 1, memo);
    }
    result += countDistinctSubsequences(s, t, m - 1, n, memo);

    memo[m][n] = result;
    return result;
}
