function countNumbersWithUniqueDigits(n) {
  if (n === 0) return 1;
  const available = 9;
  return Math.factorial(available) / (Math.factorial(available - n + 1) * Math.factorial(n));
}
