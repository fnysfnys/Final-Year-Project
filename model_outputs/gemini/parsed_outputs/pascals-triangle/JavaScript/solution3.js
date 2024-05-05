var generate = function(numRows) {
  const triangle = [];
  for (let i = 0; i < numRows; i++) {
    const row = [];
    for (let j = 0; j <= i; j++) {
      row[j] = Math.floor(factorial(i) / (factorial(j) * factorial(i - j)));
    }
    triangle.push(row);
  }
  return triangle;
  
  function factorial(n) {
    return n === 0 ? 1 : n * factorial(n - 1);
  }
};
