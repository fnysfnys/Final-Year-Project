var longestIncreasingPath = function(matrix) {
    if (matrix.length === 0) return 0;
    
    const rows = matrix.length;
    const cols = matrix[0].length;
    const memo = new Array(rows).fill(null).map(() => new Array(cols).fill(0));
    
    let maxPathLength = 0;
    
    const dfs = (row, col, prev) => {
        if (row < 0 || col < 0 || row >= rows || col >= cols || matrix[row][col] <= prev) {
            return 0;
        }
        if (memo[row][col] > 0) return memo[row][col];
        
        const current = matrix[row][col];
        const length = 1 + Math.max(
            dfs(row + 1, col, current),
            dfs(row - 1, col, current),
            dfs(row, col + 1, current),
            dfs(row, col - 1, current)
        );
        
        memo[row][col] = length;
        maxPathLength = Math.max(maxPathLength, length);
        return length;
    };
    
    for (let i = 0; i < rows; i++) {
        for (let j = 0; j < cols; j++) {
            maxPathLength = Math.max(maxPathLength, dfs(i, j, -Infinity));
        }
    }
    
    return maxPathLength;
};