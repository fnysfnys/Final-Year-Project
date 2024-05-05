var getRow = function(rowIndex) {
    if (rowIndex === 0) return [1];
    if (rowIndex === 1) return [1, 1];
    
    var prevRow = getRow(rowIndex - 1);
    var newRow = [1];
    
    for (var i = 1; i < rowIndex; i++) {
        newRow.push(prevRow[i - 1] + prevRow[i]);
    }
    
    newRow.push(1);
    return newRow;
};