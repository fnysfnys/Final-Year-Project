/**
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * ...
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function(numRows) {
    let triangle = [];
    for (let i = 0; i < numRows; i++) {
        triangle[i] = [1];
        for (let j = 1; j < i; j++) {
            triangle[i][j] = (triangle[i - 1][j - 1] || 0) + (triangle[i - 1][j] || 0);
        }
        if (i > 0) triangle[i].push(1);
    }
    return triangle;
};
