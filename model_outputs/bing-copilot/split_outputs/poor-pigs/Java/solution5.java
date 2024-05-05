class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int rounds = minutesToTest / minutesToDie;
        int pigs = 0;
        while ((1 << pigs) < buckets) {
            pigs++;
        }
        return pigs;
    }
}
