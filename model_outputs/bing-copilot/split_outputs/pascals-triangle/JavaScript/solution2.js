var generate = function(numRows) {
    if (numRows === 0) return [];
    if (numRows === 1) return [[1]];
    const prevRows = generate(numRows - 1);
    const lastRow = prevRows[prevRows.length - 1];
    const newRow = [1];
    for (let i = 1; i < lastRow.length; i++) {
        newRow.push(lastRow[i - 1] + lastRow[i]);
    }
    newRow.push(1);
    return [...prevRows, newRow];
};
