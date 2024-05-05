class Solution {
    public int numDistinct(String s, String t) {
        int[][] memo = new int[s.length()][t.length()];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return countDistinctSubsequences(s, t, 0, 0, memo);
    }
    
    private int countDistinctSubsequences(String s, String t, int sIndex, int tIndex, int[][] memo) {
        if (tIndex == t.length()) {
            return 1;
        }
        if (sIndex == s.length()) {
            return 0;
        }
    
        if (memo[sIndex][tIndex] != -1) {
            return memo[sIndex][tIndex];
        }
    
        int count = 0;
        if (s.charAt(sIndex) == t.charAt(tIndex)) {
            count += countDistinctSubsequences(s, t, sIndex + 1, tIndex + 1, memo);
        }
        count += countDistinctSubsequences(s, t, sIndex + 1, tIndex, memo);
    
        memo[sIndex][tIndex] = count;
        return count;
    }
}
