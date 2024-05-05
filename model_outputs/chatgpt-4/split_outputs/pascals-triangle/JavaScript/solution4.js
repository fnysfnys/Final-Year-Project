/**
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * ...
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function(numRows) {
    let triangle = [[1]];
    for (let i = 1; i < numRows; i++) {
        triangle[i] = [1];
        for (let j = 1; j < i; j++) {
            triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
        }
        triangle[i].push(1);
    }
    return triangle;
};
