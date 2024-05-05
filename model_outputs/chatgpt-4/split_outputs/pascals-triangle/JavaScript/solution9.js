/**
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * ...
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function(numRows) {
    let triangle = [];
    for (let i = 0; i < numRows; i++) {
        triangle[i] = Array.from({ length: i + 1 }, (v, k) => k === 0 || k === i ? 1 : triangle[i - 1][k - 1] + triangle[i - 1][k]);
    }
    return triangle;
};
