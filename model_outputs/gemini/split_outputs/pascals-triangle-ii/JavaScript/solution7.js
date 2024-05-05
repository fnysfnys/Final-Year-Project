var getRow = function(rowIndex) {
  const result = [];
  for (let i = 0; i <= rowIndex; i++) {
    result.push(Math.floor(factorial(rowIndex) / (factorial(i) * factorial(rowIndex - i))));
  }
  return result;
};
