var generate = function(numRows) {
    const result = [];
    for (let i = 0; i < numRows; i++) {
        const row = [];
        for (let j = 0; j <= i; j++) {
            row.push(factorial(i) / (factorial(j) * factorial(i - j)));
        }
        result.push(row);
    }
    return result;
};

function factorial(n) {
    if (n === 0 || n === 1) return 1;
    return n * factorial(n - 1);
}
