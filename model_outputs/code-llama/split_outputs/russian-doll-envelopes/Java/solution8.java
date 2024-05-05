public int maxEnvelopes(int[][] envelopes) {
   return maxEnvelopes(envelopes, 0);
}

private int maxEnvelopes(int[][] envelopes, int index) {
   if (index >= envelopes.length) {
       return 0;
   }
   int max = 0;
   for (int i = index + 1; i < envelopes.length; i++) {
       if (envelopes[index][0] < envelopes[i][0] && envelopes[index][1] < envelopes[i][1]) {
           max++;
       }
   }
   return max + maxEnvelopes(envelopes, index + 1);
}
