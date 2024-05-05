var countDigitOne = function(n) {
  if (n < 0) return 0;
  let digits = Math.floor(Math.log10(n) + 1);
  let sum = 0;
  for (let i = 1; i <= digits; i++) {
    let factor = Math.pow(10, i - 1);
    sum += (Math.floor(n / factor) % 10 * factor + Math.min(Math.max(n - Math.floor(n / factor) * factor + 1, 0), factor));
  }
  return sum;
};
