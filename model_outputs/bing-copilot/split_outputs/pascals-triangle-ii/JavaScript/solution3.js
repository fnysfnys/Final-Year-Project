var getRow = function(rowIndex) {
    let prevRow = [1];
    for (let i = 1; i <= rowIndex; i++) {
        const newRow = new Array(i + 1);
        newRow[0] = newRow[i] = 1;
        for (let j = 1; j < i; j++) {
            newRow[j] = prevRow[j - 1] + prevRow[j];
        }
        prevRow = newRow;
    }
    return prevRow;
};
