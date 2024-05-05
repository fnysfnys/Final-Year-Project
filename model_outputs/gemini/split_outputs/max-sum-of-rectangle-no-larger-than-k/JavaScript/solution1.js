var maxSumSubmatrix = function(matrix, k) {
  let maxSum = Number.NEGATIVE_INFINITY;
  for (let i = 0; i < matrix.length; i++) {
    for (let j = 0; j < matrix[0].length; j++) {
      let sum = matrix[i][j];
      for (let x = i; x < matrix.length; x++) {
        for (let y = j; y < matrix[0].length; y++) {
          sum += matrix[x][y];
          if (sum <= k && sum > maxSum) {
            maxSum = sum;
          }
        }
      }
    }
  }
  return maxSum;
};
