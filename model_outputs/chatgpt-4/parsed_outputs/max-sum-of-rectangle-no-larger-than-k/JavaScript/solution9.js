var maxSumSubmatrix = function(matrix, k) {
    // This approach is more efficient when the number of rows is much larger than the number of columns
    let maxSum = Number.MIN_SAFE_INTEGER;
    let rows = matrix.length, cols = matrix[0].length;

    for (let top = 0; top < rows; top++) {
        let colSum = new Array(cols).fill(0);
        for (let bottom = top; bottom < rows; bottom++) {
            for (let col = 0; col < cols; col++) {
                colSum[col] += matrix[bottom][col];
            }

            maxSum = Math.max(maxSum, getMaxSumCloseToK(colSum, k));
        }
    }

    function getMaxSumCloseToK(arr, k) {
        let sum = 0, max = Number.MIN_SAFE_INTEGER;
        for (let left = 0; left < arr.length; left++) {
            sum = 0;
            for (let right = left; right < arr.length; right++) {
                sum += arr[right];
                if (sum <= k) max = Math.max(max, sum);
            }
        }
        return max;
    }

    return maxSum;
};