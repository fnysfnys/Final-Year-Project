var maxSumSubmatrix = function(matrix, k) {
    let maxSum = Number.MIN_SAFE_INTEGER;
    let rows = matrix.length, cols = matrix[0].length;

    for (let left = 0; left < cols; left++) {
        let rowSum = new Array(rows).fill(0);
        for (let right = left; right < cols; right++) {
            for (let i = 0; i < rows; i++) {
                rowSum[i] += matrix[i][right];
            }

            maxSum = Math.max(maxSum, getMaxSumCloseToK(rowSum, k));
        }
    }

    function getMaxSumCloseToK(arr, k) {
        let sum = 0, max = Number.MIN_SAFE_INTEGER, cumSum = [0];
        for (let num of arr) {
            sum += num;
            let target = sum - k;
            let i = lowerBound(cumSum, target);
            if (i < cumSum.length) max = Math.max(max, sum - cumSum[i]);
            insertSorted(cumSum, sum);
        }
        return max;
    }

    function insertSorted(arr, value) {
        let idx = arr.findIndex(i => i > value);
        if (idx === -1) arr.push(value);
        else arr.splice(idx, 0, value);
    }

    function lowerBound(arr, value) {
        let low = 0, high = arr.length;
        while (low < high) {
            let mid = Math.floor((low + high) / 2);
            if (arr[mid] < value) low = mid + 1;
            else high = mid;
        }
        return low;
    }

    return maxSum;
};