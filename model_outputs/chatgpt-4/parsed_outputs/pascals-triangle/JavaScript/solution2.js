/**
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * ...
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function(numRows) {
    if (numRows === 1) return [[1]];
    let result = generate(numRows - 1);
    let prevRow = result[result.length - 1];
    let curRow = [1];
    for (let i = 1; i < prevRow.length; i++) {
        curRow[i] = prevRow[i] + prevRow[i - 1];
    }
    curRow.push(1);
    result.push(curRow);
    return result;
};