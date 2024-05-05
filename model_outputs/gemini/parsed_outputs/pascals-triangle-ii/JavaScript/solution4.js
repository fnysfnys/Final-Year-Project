var getRow = function(rowIndex) {
  const result = [];
  for (let i = 0; i <= rowIndex; i++) {
    result.push(factorial(rowIndex) / (factorial(i) * factorial(rowIndex - i)));
  }
  return result;
};

function factorial(n) {
  if (n === 0) return 1;
  return n * factorial(n - 1);
}
