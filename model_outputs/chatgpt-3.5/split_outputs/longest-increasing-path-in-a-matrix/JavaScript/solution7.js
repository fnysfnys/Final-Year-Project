var longestIncreasingPath = function(matrix) {
    if (matrix.length === 0) return 0;
    
    const rows = matrix.length;
    const cols = matrix[0].length;
    const memo = Array.from({ length: rows }, () => Array(cols).fill(0));
    const directions = [[1, 0], [-1, 0], [0, 1], [0, -1]];
    
    const dfs = (row, col) => {
        if (memo[row][col] !== 0) return memo[row][col];
        
        let maxPath = 1;
        for (const [dx, dy] of directions) {
            const newRow = row + dx;
            const newCol = col + dy;
            
            if (newRow >= 0 && newCol >= 0 && newRow < rows && newCol < cols && matrix[newRow][newCol] > matrix[row][col]) {
                maxPath = Math.max(maxPath, 1 + dfs(newRow, newCol));
            }
        }
        
        memo[row][col] = maxPath;
        return maxPath;
    };
    
    let maxPathLength = 0;
    for (let i = 0; i < rows; i++) {
        for (let j = 0; j < cols; j++) {
            maxPathLength = Math.max(maxPathLength, dfs(i, j));
        }
    }
    
    return maxPathLength;
};
