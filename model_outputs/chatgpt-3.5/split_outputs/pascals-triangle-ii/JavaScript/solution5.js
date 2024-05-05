function* generatePascalsTriangleRow() {
    let row = [1];
    yield row;
    
    while (true) {
        const newRow = [1];
        for (let i = 1; i < row.length; i++) {
            newRow.push(row[i - 1] + row[i]);
        }
        newRow.push(1);
        row = newRow;
        yield row;
    }
}

var getRow = function(rowIndex) {
    const generator = generatePascalsTriangleRow();
    for (let i = 0; i < rowIndex; i++) {
        generator.next();
    }
    return generator.next().value;
};
