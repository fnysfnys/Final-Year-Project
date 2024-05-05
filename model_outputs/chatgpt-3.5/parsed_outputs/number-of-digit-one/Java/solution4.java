class Solution {
    public int countDigitOne(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count += countOnes(i);
        }
        return count;
    }
    
    private int countOnes(int num) {
        int count = 0;
        while (num > 0) {
            if (num % 10 == 1) {
                count++;
            }
            num /= 10;
        }
        return count;
    }
}
