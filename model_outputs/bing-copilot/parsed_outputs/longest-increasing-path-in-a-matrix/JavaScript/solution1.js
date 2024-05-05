var longestIncreasingPath = function(matrix) {
    const rows = matrix.length;
    const cols = matrix[0].length;
    const memo = new Array(rows).fill(null).map(() => new Array(cols).fill(0));
    
    const dfs = (i, j) => {
        if (memo[i][j] > 0) return memo[i][j];
        const directions = [[0, 1], [1, 0], [0, -1], [-1, 0]];
        let maxPath = 1;
        
        for (const [dx, dy] of directions) {
            const x = i + dx;
            const y = j + dy;
            if (x >= 0 && x < rows && y >= 0 && y < cols && matrix[x][y] > matrix[i][j]) {
                maxPath = Math.max(maxPath, 1 + dfs(x, y));
            }
        }
        
        memo[i][j] = maxPath;
        return maxPath;
    };
    
    let result = 0;
    for (let i = 0; i < rows; i++) {
        for (let j = 0; j < cols; j++) {
            result = Math.max(result, dfs(i, j));
        }
    }
    
    return result;
};
