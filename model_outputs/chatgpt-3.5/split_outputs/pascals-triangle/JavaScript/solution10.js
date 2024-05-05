var generate = function(numRows) {
    var result = [];

    for (var i = 0; i < numRows; i++) {
        var row = [];
        for (var j = 0; j <= i; j++) {
            var value = factorial(i) / (factorial(j) * factorial(i - j));
            row.push(value);
        }
        result.push(row);
    }

    return result;
};

function factorial(n) {
    if (n === 0) return 1;
    return n * factorial(n - 1);
}
