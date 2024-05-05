function nthSuperUglyNumber(n, primes) {
   let low = 1;
   let high = 1000000000;
   while (low <= high) {
       let mid = Math.floor((low + high) / 2);
       if (isSuperUglyNumber(mid, primes)) {
           high = mid - 1;
       } else {
           low = mid + 1;
       }
   }
   return low;
}

function isSuperUglyNumber(number, primes) {
   for (let i = 0; i < primes.length; i++) {
       if (number % primes[i] !== 0) {
           return false;
       }
   }
   return true;
}
