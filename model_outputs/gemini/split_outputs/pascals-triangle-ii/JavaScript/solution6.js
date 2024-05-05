var getRow = function(rowIndex) {
  let prev = 1;
  const result = [];
  for (let i = 0; i <= rowIndex; i++) {
    result.push(prev);
    let curr = prev * (rowIndex - i) / (i + 1);
    for (let j = 1; j < i; j++) {
      const temp = curr;
      curr = prev + curr;
      prev = temp;
    }
    prev = curr;
  }
  return result;
};
