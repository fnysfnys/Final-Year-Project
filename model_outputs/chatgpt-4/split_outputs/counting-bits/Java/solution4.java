class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            ans[i] = countOnes(i);
        }
        return ans;
    }

    private int countOnes(int number) {
        int count = 0;
        while (number != 0) {
            count += number & 1;
            number >>>= 1; // unsigned shift
        }
        return count;
    }
}
