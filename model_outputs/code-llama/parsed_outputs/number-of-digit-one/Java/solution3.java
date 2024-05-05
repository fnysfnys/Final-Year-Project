class Solution {
    public int countDigitOne(int n) {
       int count = 0;
       while (n > 0) {
           int digit = n % 10;
           if (digit == 1) {
               count++;
           }
           n /= 10;
       }
       return count;
    }
    
}
