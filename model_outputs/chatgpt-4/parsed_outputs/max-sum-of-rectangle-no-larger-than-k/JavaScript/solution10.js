var maxSumSubmatrix = function(matrix, k) {
    // This approach minimizes memory usage for very large matrices
    let maxSum = Number.MIN_SAFE_INTEGER;
    let rows = matrix.length, cols = matrix[0].length;

    for (let left = 0; left < cols; left++) {
        let rowSum = new Array(rows).fill(0);
        for (let right = left; right < cols; right++) {
            for (let i = 0; i < rows; i++) {
                rowSum[i] += matrix[i][right];
            }

            for (let top = 0; top < rows; top++) {
                let sum = 0;
                for (let bottom = top; bottom < rows; bottom++) {
                    sum += rowSum[bottom];
                    if (sum <= k) maxSum = Math.max(maxSum, sum);
                }
            }
        }
    }

    return maxSum;
};