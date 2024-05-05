class Solution {
    public int countDigitOne(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            String number = Integer.toString(i);
            for (char digit : number.toCharArray()) {
                if (digit == '1') {
                    count++;
                }
            }
        }
        return count;
    }
}
