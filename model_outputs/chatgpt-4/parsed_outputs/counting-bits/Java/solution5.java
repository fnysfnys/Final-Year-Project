class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            ans[i] = countOnesRecursive(i);
        }
        return ans;
    }

    private int countOnesRecursive(int number) {
        if (number == 0) {
            return 0;
        } else {
            return (number & 1) + countOnesRecursive(number >> 1);
        }
    }
}