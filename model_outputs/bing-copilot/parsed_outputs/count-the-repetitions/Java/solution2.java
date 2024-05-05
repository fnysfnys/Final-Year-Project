class Solution {
    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
            int[] dp = new int[n1 + 1];
            int index = 0, count = 0;
            for (int i = 1; i <= n1; i++) {
                for (char c : s1.toCharArray()) {
                    if (c == s2.charAt(index)) {
                        index++;
                        if (index == s2.length()) {
                            index = 0;
                            count++;
                        }
                    }
                }
                dp[i] = count;
                if (dp[i] == dp[i - 1]) break;
            }
            return dp[n1] / n2;
        }
        
}
