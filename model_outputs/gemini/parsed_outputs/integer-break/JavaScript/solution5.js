function integerBreak(n) {
  if (n <= 2) return 1;
  if (n <= 9) return Math.factorial(n - 1);
  // Large numbers lead to overflow, adjust for log calculations
  const logFactorial = n * Math.log(n) - n + Math.log(2 * Math.PI * n) / 2;
  const integerPart = Math.floor(logFactorial / Math.log(3));
  const decimalPart = logFactorial / Math.log(3) - integerPart;
  return Math.pow(3, integerPart) * Math.pow(2, decimalPart);
}
