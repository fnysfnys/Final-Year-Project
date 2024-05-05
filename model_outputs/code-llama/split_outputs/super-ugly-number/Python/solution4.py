def nthSuperUglyNumber(n, primes):
   if n == 1:
       return 1
   else:
       return nthSuperUglyNumber(n-1, primes) * primes[n % len(primes)]
