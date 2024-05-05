public int maxEnvelopes(int[][] envelopes) {
   Map<Integer, Integer> map = new HashMap<>();
   for (int[] envelope : envelopes) {
       map.put(envelope[0], map.getOrDefault(envelope[0], 0) + 1);
   }
   int max = 0;
   for (int[] envelope : envelopes) {
       if (map.containsKey(envelope[0] - 1)) {
           max++;
       }
   }
   return max;
}
