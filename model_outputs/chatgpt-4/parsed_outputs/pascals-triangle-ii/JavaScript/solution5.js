var getRow = function(rowIndex) {
    let row = [1];
    for (let i = 1; i <= rowIndex; i++) {
        row = row.map((val, idx, arr) => val + (arr[idx - 1] || 0));
        row.push(1);
    }
    return row;
};
