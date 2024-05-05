/**
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * ...
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function(numRows) {
    let triangle = [];
    let i = 0;
    while (i < numRows) {
        triangle[i] = [1];
        for (let j = 1; j < i; j++) {
            triangle[i][j] = triangle[i - 1][j

 - 1] + triangle[i - 1][j];
        }
        if (i > 0) triangle[i].push(1);
        i++;
    }
    return triangle;
};
