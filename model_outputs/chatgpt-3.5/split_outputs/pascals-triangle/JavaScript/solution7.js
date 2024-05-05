var generate = function(numRows) {
    if (numRows === 0) return [];
    var result = [];

    for (var i = 0; i < numRows; i++) {
        result.push(Array(i + 1).fill(1).reduce((row, _, j) => {
            if (j !== 0 && j !== i) {
                row[j] = result[i - 1][j - 1] + result[i - 1][j];
            }
            return row;
        }, []));
    }

    return result;
};
