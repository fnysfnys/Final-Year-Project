var countDigitOne = function(n) {
  if (n < 0) return 0;
  if (n < 10) return n === 1;
  let base = Math.pow(10, Math.floor(Math.log10(n)));
  let prefix = Math.floor(n / base);
  let remainder = n % base;
  return prefix * countDigitOne(base - 1) + (prefix === 1 ? n - base + 1 : base) + countDigitOne(remainder);
};
