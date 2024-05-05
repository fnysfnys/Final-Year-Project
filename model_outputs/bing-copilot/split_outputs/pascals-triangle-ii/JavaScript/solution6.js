var getRow = function(rowIndex) {
    const memo = new Map();
    return generateRow(rowIndex, memo);
};

function generateRow(rowIndex, memo) {
    if (rowIndex === 0) return [1];
    if (memo.has(rowIndex)) return memo.get(rowIndex);
    const prevRow = generateRow(rowIndex - 1, memo);
    const newRow = [1];
    for (let i = 1; i < rowIndex; i++) {
        newRow.push(prevRow[i - 1] + prevRow[i]);
    }
    newRow.push(1);
    memo.set(rowIndex, newRow);
    return newRow;
}
