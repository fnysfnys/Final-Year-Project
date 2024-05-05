class Solution {
    public int numDistinct(String s, String t) {
        int m = s.length(), n = t.length();
        int[][] memo = new int[m + 1][n + 1];
    
        return helper(s, t, m, n, memo);
    }
    
    private int helper(String s, String t, int i, int j, int[][] memo) {
        if (j == 0) {
            return 1; // base case: empty string t
        }
        if (i == 0) {
            return 0; // base case: empty string s
        }
        if (memo[i][j] != 0) {
            return memo[i][j];
        }
    
        int res = 0;
        if (s.charAt(i - 1) == t.charAt(j - 1)) {
            res += helper(s, t, i - 1, j - 1, memo); // include current char in s
        }
        res += helper(s, t, i - 1, j, memo); // exclude current char in s
    
        memo[i][j] = res;
        return res;
    }
    
}
