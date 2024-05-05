public int integerBreak(int n) {
   if (n <= 2) {
       return 1;
   }
   int result = 1;
   for (int i = 2; i <= n; i++) {
       result *= i;
   }
   return result;
}
