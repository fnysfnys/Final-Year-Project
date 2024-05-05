var generate = function(numRows) {
    if (numRows === 0) return [];
    var result = [[1]];

    for (var i = 1; i < numRows; i++) {
        var row = [];
        row[0] = 1;
        for (var j = 1; j < i; j++) {
            row[j] = result[i - 1][j - 1] + result[i - 1][j];
        }
        row[i] = 1;
        result.push(row);
    }

    return result;
};
