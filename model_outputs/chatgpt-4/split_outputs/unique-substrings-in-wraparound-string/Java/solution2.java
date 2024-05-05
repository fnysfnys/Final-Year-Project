class Solution {
    public int findSubstringInWraproundString(String s) {
        int[] dp = new int[26];
        int length = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && (s.charAt(i) - s.charAt(i - 1) == 1 || s.charAt(i - 1) - s.charAt(i) == 25)) {
                length++;
            } else {
                length = 1;
            }

            dp[s.charAt(i) - 'a'] = Math.max(dp[s.charAt(i) - 'a'], length);
        }

        int sum = 0;
        for (int l : dp) {
            sum += l;
        }
        return sum;
    }
}
