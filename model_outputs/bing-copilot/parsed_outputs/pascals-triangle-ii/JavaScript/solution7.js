var getRow = function(rowIndex) {
    const row = [];
    for (let k = 0; k <= rowIndex; k++) {
        row.push(combination(rowIndex, k));
    }
    return row;
};

function combination(n, k) {
    let result = 1;
    for (let i = 1; i <= k; i++) {
        result = (result * (n - i + 1)) / i;
    }
    return result;
}
