/**
 * Given an m x n matrix matrix and an integer k, return the max sum of a rectangle in the matrix such that its sum is no larger than k.
 * It is guaranteed that there will be a rectangle with a sum no larger than k.
 *
 * Example 1:
 *
 * Input: matrix = [[1,0,1],[0,-2,3]], k = 2
 * Output: 2
 * Explanation: Because the sum of the blue rectangle [[0, 1], [-2, 3]] is 2, and 2 is the max number no larger than k (k = 2).
 *
 * Example 2:
 *
 * Input: matrix = [[2,2,-1]], k = 3
 * Output: 3
 *
 * Constraints:
 *
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 100
 * -100 <= matrix[i][j] <= 100
 * -105 <= k <= 105
 *
 * Follow up: What if the number of rows is much larger than the number of columns?
 *
 * @param {number[][]} matrix
 * @param {number} k
 * @return {number}
 */
var maxSumSubmatrix = function(matrix, k) {
    const rows = matrix.length;
    const cols = matrix[0].length;
    let maxSum = -Infinity;

    // Iterate over all possible left and right columns
    for (let left = 0; left < cols; left++) {
        const rowSums = new Array(rows).fill(0);

        for (let right = left; right < cols; right++) {
            // Calculate cumulative row sums for the current submatrix
            for (let row = 0; row < rows; row++) {
                rowSums[row] += matrix[row][right];
            }

            // Find the maximum subarray sum (no larger than k) using Kadane's algorithm
            let currSum = 0;
            let maxCurrSum = -Infinity;
            for (const sum of rowSums) {
                currSum = Math.max(sum, currSum + sum);
                maxCurrSum = Math.max(maxCurrSum, currSum);
            }

            // Update maxSum if the current submatrix sum is valid
            if (maxCurrSum <= k) {
                maxSum = Math.max(maxSum, maxCurrSum);
            }
        }
    }

    return maxSum;
};

// Example usage:
const matrix1 = [[1, 0, 1], [0, -2, 3]];
const k1 = 2;
console.log(maxSumSubmatrix(matrix1, k1)); // Output: 2

const matrix2 = [[2, 2, -1]];
const k2 = 3;
console.log(maxSumSubmatrix(matrix2, k2)); // Output: 3
