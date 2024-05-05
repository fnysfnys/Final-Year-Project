public int integerBreak(int n) {
   int result = 1;
   for (int i = 2; i <= n; i++) {
       if (i % 2 == 0) {
           result *= i;
       } else {
           result += i;
       }
   }
   return result;
}
