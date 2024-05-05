var maxSumSubmatrix = function(matrix, k) {
    let maxSum = Number.MIN_SAFE_INTEGER;
    let rows = matrix.length, cols = matrix[0].length;

    for (let row1 = 0; row1 < rows; row1++) {
        let sums = new Array(cols).fill(0);
        for (let row2 = row1; row2 < rows; row2++) {
            for (let col = 0; col < cols; col++) {
                sums[col] += matrix[row2][col];
            }

            let set = new Set([0]);
            let currSum = 0;
            for (let sum of sums) {
                currSum += sum;
                let target = currSum - k;
                for (let s of set) {
                    if (s >= target) {
                        maxSum = Math.max(maxSum, currSum - s);
                        break;
                    }
                }
                set.add(currSum);
            }
        }
    }

    return maxSum

;
};