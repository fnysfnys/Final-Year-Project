var getRow = function(rowIndex) {
    var row = [1];
    for (var i = 1; i <= rowIndex; i++) {
        for (var j = i - 1; j >= 1; j--) {
            row[j] += row[j - 1];
        }
        row.push(1);
    }
    return row;
};
