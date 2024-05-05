var countDigitOne = n => {
  let count = 0;
  for (let i = 0; i <= n; i++) {
    count += String(i).split('1').length - 1;
  }
  return count;
};
