class Solution {
    public int countDigitOne(int n) {
       int count = 0;
       while (n > 0) {
           if (n % 10 == 1) {
               count++;
           }
           n /= 10;
       }
       return count;
    }
    
}
