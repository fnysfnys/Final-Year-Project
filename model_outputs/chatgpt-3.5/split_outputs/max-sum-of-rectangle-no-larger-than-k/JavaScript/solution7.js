var maxSumSubmatrix = function(matrix, k) {
    const m = matrix.length;
    const n = matrix[0].length;
    let maxSum = -Infinity;

    for (let left = 0; left < n; left++) {
        const rowSum = new Array(m).fill(0);
        for (let right = left; right < n; right++) {
            for (let i = 0; i < m; i++) {
                rowSum[i] += matrix[i][right];
            }
            let currentSum = 0;
            let maxCurrentSum = -Infinity;
            for (let i = 0; i < m; i++) {
                current

Sum = Math.max(rowSum[i], currentSum + rowSum[i]);
                maxCurrentSum = Math.max(maxCurrentSum, currentSum);
            }
            if (maxCurrentSum <= k) {
                maxSum = Math.max(maxSum, maxCurrentSum);
            }
        }
    }
    
    return maxSum;
};
