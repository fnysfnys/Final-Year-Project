function countNumbersWithUniqueDigits(n) {
  if (n === 0) return 1;
  let count = 9;
  let available = 9;
  for (let i = 2; i <= n; i++) {
    count *= available--;
  }
  return count;
}
