var getRow = function(rowIndex) {
    var row = [];
    
    for (var i = 0; i <= rowIndex; i++) {
        row.push(combination(rowIndex, i));
    }
    
    return row;
};

function combination(n, k) {
    if (k === 0 || k === n) return 1;
    
    var res = 1;
    for (var i = 1; i <= k; i++) {
        res = res * (n - i + 1) / i;
    }
    
    return Math.round(res);
}