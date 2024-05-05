var generate = function(numRows) {
  const result = [];
  let prev = 1;
  for (let i = 1; i <= numRows; i++) {
    result.push(prev);
    for (let j = 1; j < i; j++) {
      result[j] = prev + result[j - 1];
      prev = result[j];
    }
    result.push(prev);
    prev = 1;
  }
  return result.map((num, i) => result.slice(i, i + i + 1));
};
