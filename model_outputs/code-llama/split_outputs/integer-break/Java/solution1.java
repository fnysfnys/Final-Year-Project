public int integerBreak(int n) {
   int result = 1;
   for (int i = 2; i <= n; i++) {
       result *= i;
   }
   return result;
}
