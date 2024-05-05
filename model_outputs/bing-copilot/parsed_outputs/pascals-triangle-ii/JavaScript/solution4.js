var getRow = function(rowIndex) {
    const row = [];
    let coeff = 1;
    for (let i = 0; i <= rowIndex; i++) {
        row.push(coeff);
        coeff = (coeff * (rowIndex - i)) / (i + 1);
    }
    return row;
};
