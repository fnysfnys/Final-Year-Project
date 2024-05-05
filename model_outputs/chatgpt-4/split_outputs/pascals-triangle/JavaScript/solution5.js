/**
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * ...
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function(numRows, triangle = [[1]]) {
    if (numRows === 1) return triangle;
    let prevRow = triangle[triangle.length - 1];
    let newRow = [1];
    for (let i = 1; i < prevRow.length; i++) {
        newRow.push(prevRow[i] + prevRow[i - 1]);
    }
    newRow.push(1);
    triangle.push(newRow);
    return generate(numRows - 1, triangle);
};
