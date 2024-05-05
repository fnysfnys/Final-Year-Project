class Solution {
    public int numDistinct(String s, String t) {
        return countDistinctSubsequences(s, t, 0, 0);
    }
    
    private int countDistinctSubsequences(String s, String t, int sIndex, int tIndex) {
        if (tIndex == t.length()) {
            return 1;
        }
        if (sIndex == s.length()) {
            return 0;
        }
    
        int count = 0;
        if (s.charAt(sIndex) == t.charAt(tIndex)) {
            count += countDistinctSubsequences(s, t, sIndex + 1, tIndex + 1);
        }
        count += countDistinctSubsequences(s, t, sIndex + 1, tIndex);
    
        return count;
    }
}
