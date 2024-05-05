class Solution {
    public int countDigitOne(int n) {
        int count = 0;
        long factor = 1; // Represents the current digit position
        while (factor <= n) {
            long currDigit = (n / factor) % 10;
            long higherDigits = n / (factor * 10);
            long lowerDigits = n % factor;
            if (currDigit == 0) {
                count += higherDigits * factor;
            } else if (currDigit == 1) {
                count += higherDigits * factor + lowerDigits + 1;
            } else {
                count += (higherDigits + 1) * factor;
            }
            factor *= 10;
        }
        return count;
    }
    
}
