var getRow = function(rowIndex) {
  const prevRow = [1];
  for (let i = 1; i <= rowIndex; i++) {
    const currRow = [];
    for (let j = 0; j <= i; j++) {
      const left = prevRow[j - 1] || 0;
      const right = prevRow[j] || 0;
      currRow.push(left + right);
    }
    prevRow = currRow;
  }
  return prevRow;
};
