var getRow = function(rowIndex) {
    return new Array(rowIndex + 1).fill(1).reduce((row, _, i) => {
        for (let j = i - 1; j > 0; j--) {
            row[j] += row[j - 1];
        }
        return row;
    }, []);
};