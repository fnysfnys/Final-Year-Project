var maxSumSubmatrix = function(matrix, k) {
  let maxSum = Number.NEGATIVE_INFINITY;
  for (let i = 0; i < matrix.length; i++) {
    let currentSum = 0;
    let minPrefixSum = 0;
    for (let j = 0; j < matrix[0].length; j++) {
      currentSum += matrix[i][j];
      maxSum = Math.max(maxSum, currentSum - minPrefixSum);
      minPrefixSum = Math.min(minPrefixSum, currentSum);
    }
  }
  return maxSum <= k ? maxSum : -1;
};
