var getRow = function(rowIndex) {
  let prev = 1;
  const result = [];
  for (let i = 0; i <= rowIndex; i++) {
    result.push(prev);
    prev = prev * (rowIndex - i) / (i + 1);
  }
  return result;
};
