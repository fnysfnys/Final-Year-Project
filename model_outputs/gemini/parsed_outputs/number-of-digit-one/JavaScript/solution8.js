var countDigitOne = n => {
  let count = 0;
  while (n > 0) {
    count += n % 10 === 1 && Math.floor(n / 10) % 2 === 0;
    n = Math.floor(n / 10);
  }
  return count;
};
