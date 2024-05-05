var generate = function(numRows) {
  const triangle = [];
  for (let i = 0; i < numRows; i++) {
    const row = [];
    for (let j = 0; j <= i; j++) {
      row[j] = combinations(i, j);
    }
    triangle.push(row);
  }
  return triangle;
  
  function combinations(n, k) {
    if (k === 0 || k === n) return 1;
    return combinations(n - 1, k - 1) + combinations(n - 1, k);
  }
};
