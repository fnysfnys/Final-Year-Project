var getRow = function(rowIndex) {
  if (rowIndex === 0) return [1];
  const prevRow = getRow(rowIndex - 1);
  const result = [];
  for (let i = 0; i <= rowIndex; i++) {
    const left = prevRow[i - 1] || 0;
    const right = prevRow[i] || 0;
    result.push(left + right);
  }
  return result;
};
