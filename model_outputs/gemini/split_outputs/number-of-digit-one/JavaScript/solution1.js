var countDigitOne = function(n) {
  let count = 0;
  for (let i = 0; i <= n; i++) {
    count += String(i).split('').filter(ch => ch === '1').length;
  }
  return count;
};
