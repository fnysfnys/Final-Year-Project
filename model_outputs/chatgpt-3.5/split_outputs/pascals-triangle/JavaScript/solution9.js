var generate = function(numRows) {
    const memo = {};

    const generateRow = function(rowNum) {
        if (rowNum === 0) return [1];
        if (memo[rowNum]) return memo[rowNum];

        const prevRow = generateRow(rowNum - 1);
        const newRow = [1];

        for (let i = 1; i < prevRow.length; i++) {
            newRow.push(prevRow[i - 1] + prevRow[i]);
        }

        newRow.push(1);
        memo[rowNum] = newRow;
        return newRow;
    };

    const result = [];

    for (let i = 0; i < numRows; i++) {
        result.push(generateRow(i));
    }

    return result;
};
