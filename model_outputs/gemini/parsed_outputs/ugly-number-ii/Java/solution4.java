class Solution {
    public int nthUglyNumber(int n) {
      int[] dp = new int[n + 1];
      PriorityQueue<Integer> pq = new PriorityQueue<>();
      dp[1] = 1;
      pq.offer(1);
      for (int i = 2; i <= n; i++) {
        int num = pq.poll();
        while (pq.peek() == num) {
          pq.poll();
        }
        dp[i] = num;
        for (int factor : new int[]{2, 3, 5}) {
          if (dp[i] > num * factor || dp[dp[i] / factor] != num) {
            pq.offer(num * factor);
          }
        }
      }
      return dp[n];
    }
    
}
