function integerBreak(n) {
   return Math.floor(Math.sqrt(2 * n + 0.25) - 0.5 + 1e-10) * Math.floor(Math.sqrt(2 * n + 0.25) - 0.5 + 1e-10);
}
