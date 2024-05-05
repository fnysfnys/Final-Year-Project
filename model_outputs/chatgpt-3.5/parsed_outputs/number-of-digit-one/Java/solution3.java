class Solution {
    public int countDigitOne(int n) {
        if (n <= 0) {
            return 0;
        }
        
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count += countOnesInNumber(i);
        }
        
        return count;
    }
    
    private int countOnesInNumber(int num) {
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
