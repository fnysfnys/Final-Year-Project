var getRow = function(rowIndex) {
    const row = new Array(rowIndex + 1).fill(1);
    for (let i = 1; i <= rowIndex / 2; i++) {
        row[i] = row[rowIndex - i] = row[i - 1] * (rowIndex - i + 1) / i;
    }
    return row;
};
