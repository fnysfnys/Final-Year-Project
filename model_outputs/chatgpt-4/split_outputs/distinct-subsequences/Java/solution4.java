public int numDistinct(String s, String t) {
    int[] dp = new int[t.length() + 1];
    dp[0] = 1;
    
    for (int i = 1; i <= s.length(); i++) {
        for (int j = t.length(); j >= 1; j--) {
            if (s.charAt(i - 1) == t.charAt(j - 1)) {
                dp[j] += dp[j - 1];
            }
        }
    }
    return dp[t.length()];
}
