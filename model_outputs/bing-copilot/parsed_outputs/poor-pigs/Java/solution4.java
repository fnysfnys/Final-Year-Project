class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int pigs = 0;
        int rounds = minutesToTest / minutesToDie;
        while (Math.pow(rounds + 1, pigs) < buckets) {
            pigs++;
        }
        return pigs;
    }
}
