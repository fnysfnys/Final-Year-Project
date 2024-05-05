var getRow = function(rowIndex) {
    let row = new Array(rowIndex + 1).fill(1);
    for (let i = 0; i <= rowIndex / 2; i++) {
        let val = (i === 0) ? 1 : row[i - 1] * (rowIndex - i + 1) / i;
        row[i] = row[rowIndex - i] = val;
    }
    return row;
};
