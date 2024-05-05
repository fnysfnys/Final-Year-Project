public int nthSuperUglyNumber(int n, int[] primes) {
   int[] uglyNumbers = new int[n];
   uglyNumbers[0] = 1;
   for (int i = 1; i < n; i++) {
       int min = Integer.MAX_VALUE;
       for (int prime : primes) {
           if (uglyNumbers[i - 1] % prime == 0) {
               min = Math.min(min, prime);
           }
       }
       uglyNumbers[i] = min;
   }
   return uglyNumbers[n - 1];
}
