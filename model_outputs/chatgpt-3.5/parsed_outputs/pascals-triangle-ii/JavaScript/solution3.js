var getRow = function(rowIndex) {
    const memo = new Map();
    
    function generateRow(rowIndex) {
        if (memo.has(rowIndex)) return memo.get(rowIndex);
        
        if (rowIndex === 0) {
            return [1];
        }
        
        const prevRow = generateRow(rowIndex - 1);
        const newRow = [1];
        
        for (let i = 1; i < rowIndex; i++) {
            newRow.push(prevRow[i - 1] + prevRow[i]);
        }
        
        newRow.push(1);
        memo.set(rowIndex, newRow);
        return newRow;
    }
    
    return generateRow(rowIndex);
};