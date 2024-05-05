function nthSuperUglyNumber(n, primes) {
  let left = 1, right = Math.pow(1000, n);
  while (left < right) {
    const mid = Math.floor((left + right) / 2);
    let count = 0;
    for (const prime of primes) {
      count += Math.floor(mid / prime);
    }
    if (count < n) {
      left = mid + 1;
    } else {
      right = mid;
    }
  }
  return left;
}
