public int countDigitOne(int n) {
   if (n == 0) {
       return 0;
   }
   int count = 0;
   while (n > 0) {
       int digit = n % 10;
       if (digit == 1) {
           count++;
       }
       n /= 10;
   }
   return count + countDigitOne(n / 10);
}

private int countDigits(int n) {
   return (int) Math.floor(Math.log10(n));
}

private int countDigitOne(int n) {
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

private int countDigitOneInDigit(int n, int digit) {
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

private int countDigitOneInDigitWithLoop(int n, int digit) {
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
