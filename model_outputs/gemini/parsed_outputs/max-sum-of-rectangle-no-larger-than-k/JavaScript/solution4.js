var maxSumSubmatrix = function(matrix, k) {
  function canFit(subarraySum) {
    let currentSum = 0;
    for (let num of subarraySum) {
      currentSum += num;
      if (currentSum > subarraySum) {
        return false;
      }
    }
    return true;
  }
  
  let maxSum = Number.NEGATIVE_INFINITY;
  for (let i = 0; i < matrix.length; i++) {
    let prefixSum = 0;
    let subarraySum = [];
    for (let j = 0; j < matrix[0].length; j++) {
      prefixSum += matrix[i][j];
      subarraySum.push(prefixSum);
      let left = 0;
      let right = subarraySum.length - 1;
      while (left <= right) {
        const mid = Math.floor((left + right) / 2);
        if (canFit(subarraySum.slice(0, mid + 1))) {
          maxSum = Math.max(maxSum, prefixSum - subarraySum[mid]);
          right = mid - 1;
        } else {
          left = mid + 1;
        }
      }
    }
  }
  return maxSum <= k ? maxSum : -1;
};
