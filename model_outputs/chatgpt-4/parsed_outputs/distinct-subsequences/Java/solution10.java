class Solution {
    public int numDistinct(String s, String t, int sIndex, int tIndex) {
        if (tIndex == t.length()) return 1;
        if (sIndex == s.length()) return 0;
        
        int count = numDistinct(s, t, sIndex + 1, tIndex);
        if (s.charAt(sIndex) == t.charAt(tIndex)) {
            count += numDistinct(s, t, sIndex + 1, tIndex + 1);
        }
        return count;
    }
    
}
