class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
      int pigs = 0;
      int maxRounds = minutesToTest / minutesToDie;
      while (Math.pow(maxRounds, pigs) < buckets) {
        pigs++;
      }
      return pigs;
    }
    
}
