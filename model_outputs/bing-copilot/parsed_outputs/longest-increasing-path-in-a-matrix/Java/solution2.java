class Solution {
    public int longestIncreasingPath(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;
            int[][] indegree = new int[m][n];
            Queue<int[]> queue = new LinkedList<>();
            int maxPath = 0;
            
            // Calculate indegree for each cell
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < 4; k++) {
                        int x = i + dx[k];
                        int y = j + dy[k];
                        if (x >= 0 && x < m && y >= 0 && y < n && matrix[x][y] > matrix[i][j]) {
                            indegree[x][y]++;
                        }
                    }
                }
            }
            
            // Add cells with indegree 0 to the queue
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (indegree[i][j] == 0) {
                        queue.offer(new int[]{i, j});
                    }
                }
            }
            
            // Perform topological sort
            while (!queue.isEmpty()) {
                int size = queue.size();
                maxPath++;
                for (int i = 0; i < size; i++) {
                    int[] cell = queue.poll();
                    for (int k = 0; k < 4; k++) {
                        int x = cell[0] + dx[k];
                        int y = cell[1] + dy[k];
                        if (x >= 0 && x < m && y >= 0 && y < n && matrix[x][y] > matrix[cell[0]][cell[1]]) {
                            if (--indegree[x][y] == 0) {
                                queue.offer(new int[]{x, y});
                            }
                        }
                    }
                }
            }
            
            return maxPath;
        }
        
}
