var getRow = function(rowIndex) {
    let row = [];
    for (let i = 0; i <= rowIndex; i++) {
        row.push(binomial(rowIndex, i));
    }
    return row;
};

function binomial(n, k) {
    let result = 1;
    for (let i = 1; i <= k; i++) {
        result *= (n + 1 - i) / i;
    }
    return Math.round(result); // Rounding is necessary due to floating point arithmetic
}
