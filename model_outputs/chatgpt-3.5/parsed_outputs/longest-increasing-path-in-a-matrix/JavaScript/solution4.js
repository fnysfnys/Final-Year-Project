var longestIncreasingPath = function(matrix) {
    if (matrix.length === 0) return 0;
    
    const rows = matrix.length;
    const cols = matrix[0].length;
    const directions = [[1, 0], [-1, 0], [0, 1], [0, -1]];
    
    const topologicalSort = () => {
        const indegrees = new Array(rows).fill(null).map(() => new Array(cols).fill(0));
        
        for (let i = 0; i < rows; i++) {
            for (let j = 0; j < cols; j++) {
                for (const [dx, dy] of directions) {
                    const newRow = i + dx;
                    const newCol = j + dy;
                    if (newRow >= 0 && newCol >= 0 && newRow < rows && newCol < cols && matrix[newRow][newCol] > matrix[i][j]) {
                        indegrees[newRow][newCol]++;
                    }
                }
            }
        }
        
        const queue = [];
        for (let i = 0; i < rows; i++) {
            for (let j = 0; j < cols; j++) {
                if (indegrees[i][j] === 0) {
                    queue.push([i, j]);
                }
            }
        }
        
        let length = 0;
        while (queue.length) {
            length++;
            const size = queue.length;
            
            for (let i = 0; i < size; i++) {
                const [row, col] = queue.shift();
                
                for (const [dx, dy] of directions) {
                    const newRow = row + dx;
                    const newCol = col + dy;
                    
                    if (newRow >= 0 && newCol >= 0 && newRow < rows && newCol < cols && matrix[newRow][newCol] < matrix[row][col]) {
                        indegrees[newRow][newCol]--;
                        
                        if (indegrees[newRow][newCol] === 0) {
                            queue.push([newRow, newCol]);
                        }
                    }
                }
            }
        }
        
        return length;
    };
    
    return topologicalSort();
};