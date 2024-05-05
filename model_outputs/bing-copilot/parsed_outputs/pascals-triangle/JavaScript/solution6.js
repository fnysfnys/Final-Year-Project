var generate = function(numRows) {
    return Array.from({ length: numRows }, (_, i) => {
        return Array.from({ length: i + 1 }, (_, j) => {
            if (j === 0 || j === i) return 1;
            return result[i - 1][j - 1] + result[i - 1][j];
        });
    });
};
