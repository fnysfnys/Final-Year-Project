var getRow = function(rowIndex) {
    const row = [];
    for (let i = 0; i <= rowIndex; i++) {
        row.push(factorial(rowIndex) / (factorial(i) * factorial(rowIndex - i)));
    }
    return row;
};

function factorial(n) {
    if (n === 0) return 1;
    return n * factorial(n - 1);
}
