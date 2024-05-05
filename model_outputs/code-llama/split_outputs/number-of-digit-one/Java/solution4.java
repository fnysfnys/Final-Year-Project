public int countDigitOne(int n) {
   if (n == 0) {
       return 0;
   }
   int count = 0;
   int digit = n % 10;
   if (digit == 1) {
       count++;
   }
   return count + countDigitOne(n / 10);
}
