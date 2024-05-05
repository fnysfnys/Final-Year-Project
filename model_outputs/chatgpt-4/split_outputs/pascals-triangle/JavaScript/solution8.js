/**
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * ...
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function(numRows) {
    return new Array(numRows).fill().reduce((triangle, _, i) => {
        triangle.push([1].concat(Array.from({ length: i }, (v, j) => triangle[i - 1][j] + triangle[i - 1][j + 1] || 1)));
        return triangle;
    }, []);
};
