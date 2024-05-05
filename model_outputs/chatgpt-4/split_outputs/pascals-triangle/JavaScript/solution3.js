/**
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * ...
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function(numRows) {
    let triangle = [];
    for (let i = 0; i < numRows; i++) {
        triangle[i] = Array(i + 1).fill(1).map((val, idx) => {
            return idx === 0 || idx === i ? 1 : triangle[i - 1][idx - 1] + triangle[i - 1][idx];
        });
    }
    return triangle;
};
