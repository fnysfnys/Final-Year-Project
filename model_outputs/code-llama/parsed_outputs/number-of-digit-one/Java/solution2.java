class Solution {
    public int countDigitOne(int n) {
       if (n == 0) {
           return 0;
       }
       int count = 0;
       if (n % 10 == 1) {
           count++;
       }
       return count + countDigitOne(n / 10);
    }
    
}
