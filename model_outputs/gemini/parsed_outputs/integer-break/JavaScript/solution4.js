function integerBreak(n) {
  if (n === 2) return 1;
  let numThrees = Math.floor(n / 3);
  const reminder = n % 3;
  if (reminder === 0) return Math.pow(3, numThrees);
  if (reminder === 1) return Math.pow(3, numThrees - 1) * 4;
  return Math.pow(3, numThrees) * 2;
}
