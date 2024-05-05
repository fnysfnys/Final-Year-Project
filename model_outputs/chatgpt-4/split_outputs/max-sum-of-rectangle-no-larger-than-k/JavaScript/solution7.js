var maxSumSubmatrix = function(matrix, k) {
    let maxSum = Number.MIN_SAFE_INTEGER;
    let rows = matrix.length, cols = matrix[0].length;

    for (let left = 0; left < cols; left++) {
        let rowSum = new Array(rows).fill(0);
        for (let right = left; right < cols; right++) {
            for (let i = 0; i < rows; i++) {
                rowSum[i] += matrix[i][right];
            }

            maxSum = Math.max(maxSum, kadane(rowSum, k));
        }
    }

    function kadane(arr, k) {
        let max = Number.MIN_SAFE_INTEGER, sum = 0;
        for (let i = 0; i < arr.length; i++) {
            sum = Math.max(arr[i], sum + arr[i]);
            if (sum <= k) max = Math.max(max, sum);
        }
        return max;
    }

    return maxSum;
};
