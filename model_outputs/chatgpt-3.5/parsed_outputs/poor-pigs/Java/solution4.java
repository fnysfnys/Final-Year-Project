class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int tests = minutesToTest / minutesToDie + 1;
        int pigs = 0;
        int left = 1;
        int right = buckets;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (Math.pow(tests, mid) >= buckets) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            pigs = left;
        }
        
        return pigs;
    }
}
