public int maxEnvelopes(int[][] envelopes) {
   return maxEnvelopes(envelopes, 0, envelopes.length - 1);
}

private int maxEnvelopes(int[][] envelopes, int lo, int hi) {
   if (lo > hi) {
       return 0;
   }
   int mid = (lo + hi) / 2;
   int left = maxEnvelopes(envelopes, lo, mid - 1);
   int right = maxEnvelopes(envelopes, mid + 1, hi);
   int max = 0;
   for (int i = lo; i <= mid; i++) {
       for (int j = mid + 1; j <= hi; j++) {
           if (envelopes[i][0] < envelopes[j][0] && envelopes[i][1] < envelopes[j][1]) {
               max++;
           }
       }
   }
   return max + left + right;
}
