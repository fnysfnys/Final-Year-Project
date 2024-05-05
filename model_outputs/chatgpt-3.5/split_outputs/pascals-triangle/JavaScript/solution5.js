function* generate(numRows) {
    if (numRows < 1) return;

    let row = [1];
    yield row;

    for (let i = 1; i < numRows; i++) {
        let nextRow = [1];
        for (let j = 1; j < i; j++) {
            nextRow[j] = row[j - 1] + row[j];
        }
        nextRow.push(1);
        row = nextRow;
        yield row;
    }
}

const result = [...generate(5)];
