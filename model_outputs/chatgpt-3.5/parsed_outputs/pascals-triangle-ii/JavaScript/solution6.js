var getRow = function(rowIndex) {
    var row = [];
    var val = 1;
    
    for (var i = 0; i <= rowIndex; i++) {
        row.push(val);
        val = val * (rowIndex - i) / (i + 1);
    }
    
    return row;
};