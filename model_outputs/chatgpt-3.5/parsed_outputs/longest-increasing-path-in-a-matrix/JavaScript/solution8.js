var longestIncreasingPath = function(matrix) {
    if (matrix.length === 0) return 0;
    
    const rows = matrix.length;
    const cols = matrix[0].length;
    const memo = Array.from({ length: rows }, () => Array(cols).fill(0));
    const directions = [[1, 0], [-1, 0], [0, 1], [0, -1]];
    
    const isValidMove = (row, col, prev) => {
        return row >= 0 && col >= 0 && row < rows && col < cols && matrix[row][col] > prev;
    };
    
    const bfs = (row, col) => {
        let maxPath = 1;
        const queue = [[row, col, 1]];
        
        while (queue.length) {
            const [r, c, length] = queue.shift();
            maxPath = Math.max(maxPath, length);
            
            for (const [dx, dy] of directions) {
                const newRow = r + dx;
                const newCol = c + dy;
                
                if (isValidMove(newRow, newCol, matrix[r][c])) {
                    queue.push([newRow, newCol, length + 1]);
                }
            }
        }
        
        return maxPath;
    };
    
    let maxPathLength = 0;
    for (let i = 0; i < rows; i++) {
        for (let j = 0; j < cols; j++) {
            if (memo[i][j] === 0) {
                memo[i][j] = bfs(i, j);
                maxPathLength = Math.max(maxPathLength, memo[i][j]);
            }
        }
    }
    
    return maxPathLength;
};