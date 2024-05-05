var generate = function(numRows) {
    if (numRows === 0) return [];
    if (numRows === 1) return [[1]];

    var prevTriangle = generate(numRows - 1);
    var prevRow = prevTriangle[numRows - 2];
    var newRow = [1];

    for (var i = 1; i < prevRow.length; i++) {
        newRow.push(prevRow[i - 1] + prevRow[i]);
    }

    newRow.push(1);
    prevTriangle.push(newRow);
    return prevTriangle;
};