/**
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * ...
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function(numRows) {
    let triangle = [[1]];
    for (let i = 1; i < numRows; i++) {
        let prevRow = triangle[i - 1];
        let newRow = [1];
        for (let j = 1; j < i; j++) {
            newRow[j] = prevRow[j - 1] + prevRow[j];
        }
        newRow.push(1);
        triangle.push(newRow);
    }
    return triangle;
};
