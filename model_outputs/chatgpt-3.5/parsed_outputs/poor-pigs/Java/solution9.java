class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int tests = minutesToTest / minutesToDie + 1;
        int pigs = 0;
        int remainingBuckets = buckets;
        
        while (Math.pow(tests, pigs) < buckets) {
            pigs++;
            if (pigs * minutesToDie > minutesToTest) {
                break;
            }
        }
        
        return pigs;
    }
}
