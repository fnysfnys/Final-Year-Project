var getRow = function(rowIndex) {
    if (rowIndex === 0) return [1];
    var row = [1];
    for (var i = 1; i <= rowIndex; i++) {
        var newRow = [1];
        for (var j = 1; j < row.length; j++) {
            newRow.push(row[j - 1] + row[j]);
        }
        newRow.push(1);
        row = newRow;
    }
    return row;
};