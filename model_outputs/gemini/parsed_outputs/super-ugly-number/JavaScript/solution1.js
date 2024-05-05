function nthSuperUglyNumber(n, primes) {
  let count = 0, num = 1;
  while (count < n) {
    if (isSuperUgly(num, primes)) {
      count++;
    }
    num++;
  }
  return num - 1;
}

function isSuperUgly(num, primes) {
  for (let prime of primes) {
    while (num % prime === 0) {
      num /= prime;
    }
  }
  return num === 1;
}
