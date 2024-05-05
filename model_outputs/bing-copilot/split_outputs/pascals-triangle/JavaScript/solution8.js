var generate = function(numRows) {
    const result = [];
    for (let i = 0; i < numRows; i++) {
        const row = [1, ...result[i - 1].map((val, j) => val + (result[i - 1][j + 1] || 0)), 1];
        result.push(row);
    }
    return result;
};
