class Solution {
    public int countDigitOne(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            String str = String.valueOf(i);
            for (char c : str.toCharArray()) {
                if (c == '1') {
                    count++;
                }
            }
        }
        return count;
    }
}
