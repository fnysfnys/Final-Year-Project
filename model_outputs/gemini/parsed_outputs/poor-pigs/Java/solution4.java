class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
      int maxRounds = minutesToTest / minutesToDie;
      return (int) Math.ceil(Math.log(buckets) / Math.log(maxRounds + 1));
    }
    
}
