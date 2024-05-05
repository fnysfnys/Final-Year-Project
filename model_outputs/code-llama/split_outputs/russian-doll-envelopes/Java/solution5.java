public int maxEnvelopes(int[][] envelopes) {
   Arrays.sort(envelopes, (a, b) -> a[0] - b[0]);
   int max = 0;
   for (int i = 0; i < envelopes.length; i++) {
       int lo = 0, hi = envelopes.length - 1;
       while (lo <= hi) {
           int mid = (lo + hi) / 2;
           if (envelopes[i][0] < envelopes[mid][0] && envelopes[i][1] < envelopes[mid][1]) {
               max++;
               break;
           }
           if (envelopes[i][0] < envelopes[mid][0]) {
               hi = mid - 1;
           } else {
               lo = mid + 1;
           }
       }
   }
   return max;
}
