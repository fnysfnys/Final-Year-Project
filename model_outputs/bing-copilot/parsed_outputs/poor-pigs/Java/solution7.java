class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int rounds = minutesToTest / minutesToDie;
        return buckets == 1 ? 0 : (int) Math.ceil(Math.log(buckets) / Math.log(rounds + 1));
    }
}
