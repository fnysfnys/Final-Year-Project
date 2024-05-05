var getRow = function(rowIndex) {
    let row = [1], temp;
    for (let i = 1; i <= rowIndex; i++) {
        temp = [1];
        for (let j = 1; j < row.length; j++) {
            temp[j] = row[j] + row[j - 1];
        }
        temp.push(1);
        row = temp;
    }
    return row;
};
