class Solution {
    public int integerBreak(int n) {
        int[] maxProducts = {0, 0, 1, 2, 4, 6, 9, 12, 18, 27, 36, 48, 81, 108, 144, 243, 324, 432, 729, 972, 1296, 2187, 2916, 3888, 6561, 8748, 11664, 19683, 26244, 34992, 59049, 78732, 104976};
        return maxProducts[n];
    }
}
