class Solution {
    public int countDigitOne(int n) {
        int count = 0, factor = 1, digit;
        while (n / factor != 0) {
            digit = (n / factor) % 10;
            int lower = n - (n / factor) * factor;
            int higher = n / (factor * 10);
    
            if (digit == 1) {
                count += higher * factor + lower + 1;
            } else if (digit > 1) {
                count += (higher + 1) * factor;
            } else {
                count += higher * factor;
            }
            factor *= 10;
        }
        return count;
    }
}
