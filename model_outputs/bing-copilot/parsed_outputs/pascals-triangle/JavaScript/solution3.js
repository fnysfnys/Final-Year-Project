var generate = function(numRows) {
    const memo = new Map();
    function getRow(rowNum) {
        if (rowNum === 0) return [1];
        if (memo.has(rowNum)) return memo.get(rowNum);
        const prevRow = getRow(rowNum - 1);
        const newRow = [1];
        for (let i = 1; i < prevRow.length; i++) {
            newRow.push(prevRow[i - 1] + prevRow[i]);
        }
        newRow.push(1);
        memo.set(rowNum, newRow);
        return newRow;
    }
    const result = [];
    for (let i = 0; i < numRows; i++) {
        result.push(getRow(i));
    }
    return result;
};
