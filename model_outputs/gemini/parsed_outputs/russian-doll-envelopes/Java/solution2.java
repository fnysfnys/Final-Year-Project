class Solution {
    public int maxEnvelopes(int[][] envelopes) {
      int n = envelopes.length;
      Arrays.sort(envelopes, (a, b) -> a[0] == b[0] ? Integer.compare(b[1], a[1]) : Integer.compare(a[0], b[0]));
      int[][] memo = new int[n][n];
      return maxEnvelopesHelper(envelopes, 0, -1, memo);
    }
    
    private int maxEnvelopesHelper(int[][] envelopes, int i, int prev, int[][] memo) {
      if (i == envelopes.length) {
        return 0;
      }
      if (memo[i][prev] > 0) {
        return memo[i][prev];
      }
      int exclude = maxEnvelopesHelper(envelopes, i + 1, prev, memo);
      int include = 0;
      if (prev == -1 || envelopes[i][0] > envelopes[prev][0] && envelopes[i][1] > envelopes[prev][1]) {
        include = maxEnvelopesHelper(envelopes, i + 1, i, memo) + 1;
      }
      memo[i][prev] = Math.max(exclude, include);
      return memo[i][prev];
    }
    
}
