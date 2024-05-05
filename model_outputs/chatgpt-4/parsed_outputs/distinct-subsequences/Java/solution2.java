class Solution {
    public int numDistinct(String s, String t) {
        Integer[][] memo = new Integer[s.length()][t.length()];
        return numDistinctHelper(s, t, s.length() - 1, t.length() - 1, memo);
    }
    
    private int numDistinctHelper(String s, String t, int sIndex, int tIndex, Integer[][] memo) {
        if (tIndex < 0) return 1;
        if (sIndex < 0) return 0;
        if (memo[sIndex][tIndex] != null) return memo[sIndex][tIndex];
        
        if (s.charAt(sIndex) == t.charAt(tIndex)) {
            memo[sIndex][tIndex] = numDistinctHelper(s, t, sIndex - 1, tIndex - 1, memo) + numDistinctHelper(s, t, sIndex - 1, tIndex, memo);
        } else {
            memo[sIndex][tIndex] = numDistinctHelper(s, t, sIndex - 1, tIndex, memo);
        }
        
        return memo[sIndex][tIndex];
    }
}