class Solution {
    public int longestIncreasingPath(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;
            int[][] memo = new int[m][n];
            int maxPath = 0;
            
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    maxPath = Math.max(maxPath, dfs(matrix, i, j, memo));
                }
            }
            
            return maxPath;
        }
        
        private int dfs(int[][] matrix, int i, int j, int[][] memo) {
            if (memo[i][j] != 0) {
                return memo[i][j];
            }
            
            int[] dx = {-1, 1, 0, 0};
            int[] dy = {0, 0, -1, 1};
            int maxLen = 1;
            
            for (int k = 0; k < 4; k++) {
                int x = i + dx[k];
                int y = j + dy[k];
                
                if (x >= 0 && x < matrix.length && y >= 0 && y < matrix[0].length && matrix[x][y] > matrix[i][j]) {
                    maxLen = Math.max(maxLen, 1 + dfs(matrix, x, y, memo));
                }
            }
            
            memo[i][j] = maxLen;
            return maxLen;
        }
        
}
