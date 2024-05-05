class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            ans[i] = countOnesKernighan(i);
        }
        return ans;
    }

    private int countOnesKernighan(int number) {
        int count = 0;
        while (number != 0) {
            number &= (number - 1); // clear the least significant bit set
            count++;
        }
        return count;
    }
}
