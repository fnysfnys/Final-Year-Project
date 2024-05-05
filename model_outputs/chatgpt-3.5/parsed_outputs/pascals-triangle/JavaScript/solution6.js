var generate = function(numRows) {
    if (numRows === 0) return [];
    var result = [];

    for (var i = 0; i < numRows; i++) {
        var row = Array(i + 1).fill(1);
        for (var j = 1; j < i; j++) {
            row[j] = result[i - 1][j - 1] + result[i - 1][j];
        }
        result.push(row);
    }

    return result;
};