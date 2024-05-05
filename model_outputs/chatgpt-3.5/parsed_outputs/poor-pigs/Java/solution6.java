class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int tests = minutesToTest / minutesToDie + 1;
        int pigs = 0;
        int remainingBuckets = buckets;
        
        while (remainingBuckets > 0) {
            remainingBuckets /= tests;
            pigs++;
        }
        
        return pigs;
    }
}
