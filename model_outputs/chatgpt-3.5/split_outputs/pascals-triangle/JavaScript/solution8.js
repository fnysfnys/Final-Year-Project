var generate = function(numRows) {
    if (numRows === 0) return [];
    var result = [];

    for (var i = 0; i < numRows; i++) {
        var row = [1];
        for (var j = 1; j < i; j++) {
            var [left, right] = result[i - 1].slice(j - 1, j + 1);
            row[j] = left + right;
        }
        if (i !== 0) row.push(1);
        result.push(row);
    }

    return result;
};
