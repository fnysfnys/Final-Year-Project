var getRow = function(rowIndex) {
    if (rowIndex === 0) return [1];
    const prevRow = getRow(rowIndex - 1);
    const newRow = [1];
    for (let i = 1; i < rowIndex; i++) {
        newRow.push(prevRow[i - 1] + prevRow[i]);
    }
    newRow.push(1);
    return newRow;
};
