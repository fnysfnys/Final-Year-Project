var maxSumSubmatrix = function(matrix, k) {
  const prefixSum = [];
  for (let i = 0; i < matrix.length; i++) {
    prefixSum[i] = new Array(matrix[0].length + 1).fill(0);
    for (let j = 0; j < matrix[0].length; j++) {
      prefixSum[i][j + 1] = prefixSum[i][j] + matrix[i][j];
    }
  }
  
  let maxSum = Number.NEGATIVE_INFINITY;
  for (let i = 0; i < matrix.length; i++) {
    for (let j = 0; j < matrix[0].length; j++) {
      for (let x = i + 1; x <= matrix.length; x++) {
        for (let y = j + 1; y <= matrix[0].length; y++) {
          const sum = prefixSum[x - 1][y] - prefixSum[i][j];
          if (sum <= k && sum > maxSum) {
            maxSum = sum;
          }
        }
      }
    }
  }
  return maxSum;
};
