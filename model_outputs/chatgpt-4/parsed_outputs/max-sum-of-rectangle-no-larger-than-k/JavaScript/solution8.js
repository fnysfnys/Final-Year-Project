var maxSumSubmatrix = function(matrix, k) {
    let maxSum = Number.MIN_SAFE_INTEGER;
    let rows = matrix.length, cols = matrix[0].length;

    for (let left = 0; left < cols; left++) {
        let rowSum = new Array(rows).fill(0);
        for (let right = left; right < cols; right++) {
            for (let i = 0; i < rows; i++) {
                rowSum[i] += matrix[i][right];
            }

            let sumSet = new Set

([0]);
            let currSum = 0;
            for (let sum of rowSum) {
                currSum += sum;
                let it = [...sumSet].find(x => x >= currSum - k);
                if (it !== undefined) maxSum = Math.max(maxSum, currSum - it);
                sumSet.add(currSum);
            }
        }
    }

    return maxSum;
};