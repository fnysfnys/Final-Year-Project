class Solution {
    public int countDigitOne(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count += Integer.toString(i).chars().filter(ch -> ch == '1').count();
        }
        return count;
    }
}
