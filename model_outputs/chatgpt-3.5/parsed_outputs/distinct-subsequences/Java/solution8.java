class Solution {
    public int numDistinct(String s, String t) {
        int[][] memo = new int[s.length() + 1][t.length() + 1];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return countDistinctSubsequences(s, t, s.length(), t.length(), memo);
    }
    
    private int countDistinctSubsequences(String s, String t, int m, int n, int[][] memo) {
        if (n == 0) {
            return 1;
        }
        if (m == 0) {
            return 0;
        }
    
        if (memo[m][n] != -1) {
            return memo[m][n];
        }
    
        int count = 0;
        if (s.charAt(m - 1) == t.charAt(n - 1)) {
            count += countDistinctSubsequences(s, t, m - 1, n - 1, memo);
        }
        count += countDistinctSubsequences(s, t, m - 1, n, memo);
    
        memo[m][n] = count;
        return count;
    }
}
