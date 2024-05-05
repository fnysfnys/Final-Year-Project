var generate = function(numRows) {
  const triangle = [];
  for (let i = 0; i < numRows; i++) {
    const row = [];
    for (let j = 0; j <= i; j++) {
      const k = Math.min(j, i - j);
      row[j] = triangle[i - 1][k] || triangle[i - 1][i - k];
    }
    triangle.push(row);
  }
  return triangle;
};
