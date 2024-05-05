class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        if (buckets == 1) {
            return 0;
        }
        int rounds = minutesToTest / minutesToDie;
        return 1 + poorPigs(buckets - 1, minutesToDie, minutesToTest - rounds);
    }
}
