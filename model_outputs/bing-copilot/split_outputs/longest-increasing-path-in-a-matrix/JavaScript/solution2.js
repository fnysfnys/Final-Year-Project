var longestIncreasingPath = function(matrix) {
    const rows = matrix.length;
    const cols = matrix[0].length;
    const indegree = new Array(rows).fill(null).map(() => new Array(cols).fill(0));
    const directions = [[0, 1], [1, 0], [0, -1], [-1, 0]];
    
    for (let i = 0; i < rows; i++) {
        for (let j = 0; j < cols; j++) {
            for (const [dx, dy] of directions) {
                const x = i + dx;
                const y = j + dy;
                if (x >= 0 && x < rows && y >= 0 && y < cols && matrix[x][y] < matrix[i][j]) {
                    indegree[x][y]++;
                }
            }
        }
    }
    
    const queue = [];
    for (let i = 0; i < rows; i++) {
        for (let j = 0; j < cols; j++) {
            if (indegree[i][j] === 0) {
                queue.push([i, j]);
            }
        }
    }
    
    let result = 0;
    while (queue.length > 0) {
        const [i, j] = queue.shift();
        for (const [dx, dy] of directions) {
            const x = i + dx;
            const y = j + dy;
            if (x >= 0 && x < rows && y >= 0 && y < cols && matrix[x][y] > matrix[i][j]) {
                indegree[x][y]--;
                if (indegree[x][y] === 0) {
                    queue.push([x, y]);
                }
            }
        }
        result++;
    }
    
    return result;
};
