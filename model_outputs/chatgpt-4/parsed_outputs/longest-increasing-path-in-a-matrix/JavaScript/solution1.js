var longestIncreasingPath = function(matrix) {
       if (!matrix.length || !matrix[0].length) return 0;

       let m = matrix.length, n = matrix[0].length;
       let memo = Array.from({length: m}, () => Array(n).fill(0));
       let dirs = [[1, 0], [-1, 0], [0, 1], [0, -1]];
       let maxPath = 0;

       function dfs(x, y) {
           if (memo[x][y] !== 0) return memo[x][y];
           let max = 1;
           for (let [dx, dy] of dirs) {
               let nx = x + dx, ny = y + dy;
               if (nx >= 0 && nx < m && ny >= 0 && ny < n && matrix[nx][ny] > matrix[x][y]) {
                   max = Math.max(max, 1 + dfs(nx, ny));
               }
           }
           memo[x][y] = max;
           return max;
       }

       for (let i = 0; i < m; i++) {
           for (let j = 0; j < n; j++) {
               maxPath = Math.max(maxPath, dfs(i, j));
           }
       }
       return maxPath;
   };