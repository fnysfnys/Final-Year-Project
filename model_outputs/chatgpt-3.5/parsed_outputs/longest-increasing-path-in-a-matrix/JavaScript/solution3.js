var longestIncreasingPath = function(matrix) {
    if (matrix.length === 0) return 0;
    
    const rows = matrix.length;
    const cols = matrix[0].length;
    const directions = [[1, 0], [-1, 0], [0, 1], [0, -1]];
    
    const isValidMove = (row, col, prev) => {
        return row >= 0 && col >= 0 && row < rows && col < cols && matrix[row][col] > prev;
    };
    
    let maxPathLength = 0;
    
    for (let i = 0; i < rows; i++) {
        for (let j = 0; j < cols; j++) {
            const queue = [[i, j, 1]];
            
            while (queue.length) {
                const [row, col, length] = queue.shift();
                maxPathLength = Math.max(maxPathLength, length);
                
                for (const [dx, dy] of directions) {
                    const newRow = row + dx;
                    const newCol = col + dy;
                    
                    if (isValidMove(newRow, newCol, matrix[row][col])) {
                        queue.push([newRow, newCol, length + 1]);
                    }
                }
            }
        }
    }
    
    return maxPathLength;
};