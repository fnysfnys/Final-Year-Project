var getRow = function(rowIndex, currentRow = [1], level = 0) {
    if (rowIndex === 0) return currentRow;
    if (level === rowIndex) return currentRow;

    let newRow = [1];
    for (let i = 1; i < currentRow.length; i++) {
        newRow[i] = currentRow[i] + currentRow[i - 1];
    }
    newRow.push(1);
    return getRow(rowIndex, newRow, level + 1);
};
