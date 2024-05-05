class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            ans[i] = Integer.toBinaryString(i).replaceAll("0", "").length();
        }
        return ans;
    }
}
