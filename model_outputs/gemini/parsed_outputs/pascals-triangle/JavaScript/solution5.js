var generate = function(numRows) {
  const triangle = [[1]];
  for (let i = 1; i < numRows; i++) {
    const row = [];
    const prevRow = triangle[i - 1];
    for (let j = 0; j < i + 1; j++) {
      row[j] = (prevRow[j - 1] || 0) + (prevRow[j] || 0);
    }
    triangle.push(row);
  }
  return triangle;
};
