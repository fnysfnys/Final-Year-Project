var getRow = function(rowIndex) {
    var row = new Array(rowIndex + 1).fill(0);
    row[0] = 1;
    
    for (var i = 1; i <= rowIndex; i++) {
        for (var j = i; j >= 1; j--) {
            row[j] += row[j - 1];
        }
    }
    
    return row;
};
