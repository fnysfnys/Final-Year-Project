var nthUglyNumber = function(n) {
  let count = 0, num = 1;
  while (count < n) {
    if (num % 2 === 0) num /= 2;
    else if (num % 3 === 0) num /= 3;
    else if (num % 5 === 0) num /= 5;
    else count++;
    num++;
  }
  return num - 1;
};
