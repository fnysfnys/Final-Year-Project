var maxSumSubmatrix = function(matrix, k) {
    let maxSum = Number.MIN_SAFE_INTEGER;
    let rows = matrix.length, cols = matrix[0].length;

    for (let row1 = 0; row1 < rows; row1++) {
        let sums = new Array(cols).fill(0);
        for (let row2 = row1; row2 < rows; row2++) {
            for (let col = 0; col < cols; col++) {
                sums[col] += matrix[row2][col];
            }

            for (let col1 = 0; col1 < cols; col1++) {
                let sum = 0;
                for (let col2 = col1; col2 < cols; col2++) {
                    sum += sums[col2];
                    if (sum <= k) maxSum = Math.max(maxSum, sum);
                }
            }
        }
    }

    return maxSum;
};
