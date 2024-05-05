var generate = function(numRows) {
    const result = new Array(numRows).fill().map((_, i) => {
        const row = new Array(i + 1).fill(1);
        for (let j = 1; j < i; j++) {
            row[j] = result[i - 1][j - 1] + result[i - 1][j];
        }
        return row;
    });
    return result;
};
