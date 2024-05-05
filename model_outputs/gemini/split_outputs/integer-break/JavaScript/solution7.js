function integerBreak(n) {
  if (n < 4) return n - 1;
  const k = Math.floor(Math.log(n) / Math.log(2));
  const offset = (1 << k) - 1;
  return ((n - offset) << k);
}
