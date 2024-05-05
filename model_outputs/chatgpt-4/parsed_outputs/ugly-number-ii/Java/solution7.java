class Solution {
    public int nthUglyNumber(int n) {
        int[] ugly = new int[3];
        ugly[0] = ugly[1] = ugly[2] = 1;
        int nextUgly, next2 = 2, next3 = 3, next5 = 5;
        int i2 = 0, i3 = 0, i5 = 0;
        for (int i = 1; i < n; i++) {
            nextUgly = Math.min(next2, Math.min(next3, next5));
            if (nextUgly == next2) next2 = 2 * ugly[++i2];
            if (nextUgly == next3) next3 = 3 * ugly[++i3];
            if (nextUgly == next5) next5 = 5 * ugly[++i5];
            ugly[i % 3] = nextUgly;
        }
        return ugly[(n - 1) % 3];
    }
}
