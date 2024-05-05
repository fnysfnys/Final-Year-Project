class Solution {
    public int numDistinct(String s, String t) {
        return numDistinctHelper(s, t, s.length(), t.length());
    }
    
    private int numDistinctHelper(String s, String t, int sLen, int tLen) {
        if (tLen == 0) return 1;
        if (sLen == 0) return 0;
        
        if (s.charAt(sLen - 1) == t.charAt(tLen - 1)) {
            return numDistinctHelper(s, t, sLen - 1, tLen - 1) + numDistinctHelper(s, t, sLen - 1, tLen);
        } else {
            return numDistinctHelper(s, t, sLen - 1, tLen);
        }
    }
}