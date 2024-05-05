const lookup = [0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19];
var countDigitOne = n => {
  let sum = 0;
  while (n > 0) {
    sum += lookup[n % 10];
    n = Math.floor(n / 10);
  }
  return sum;
};
