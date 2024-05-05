class Solution {
    public int maxEnvelopes(int[][] envelopes) {
       int max = 0;
       for (int i = 0; i < envelopes.length; i++) {
           for (int j = i + 1; j < envelopes.length; j++) {
               if (envelopes[i][0] < envelopes[j][0] && envelopes[i][1] < envelopes[j][1]) {
                   max++;
               }
           }
       }
       return max;
    }
    
}
