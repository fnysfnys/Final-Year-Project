var getRow = function(rowIndex) {
    var triangle = generatePascalsTriangle(rowIndex + 1);
    return triangle[rowIndex];
};

function generatePascalsTriangle(numRows) {
    var triangle = [];
    
    for (var i = 0; i < numRows; i++) {
        var row = [];
        row[0] = 1;
        for (var j = 1; j < i; j++) {
            row[j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
        }
        if (i > 0) {
            row[i] = 1;
        }
        triangle.push(row);
    }
    
    return triangle;
}