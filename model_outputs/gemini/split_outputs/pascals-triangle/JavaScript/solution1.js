var generate = function(numRows) {
  if (numRows === 1) return [[1]];
  const prevRow = generate(numRows - 1);
  const newRow = [];
  for (let i = 0; i < prevRow.length + 1; i++) {
    newRow[i] = (prevRow[i - 1] || 0) + (prevRow[i] || 0);
  }
  return [newRow, ...prevRow];
};
