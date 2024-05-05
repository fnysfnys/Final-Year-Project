public int longestIncreasingPath(int[][] matrix) {
    if (matrix == null || matrix.length == 0) return 0;
    int m = matrix.length, n = matrix[0].length;
    int[][] indegree = new int[m][n];
    Queue<int[]> queue = new LinkedList<>();
    int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            for (int[] dir : directions) {
                int x = i + dir[0];
                int y = j + dir[1];
                if (x >= 0 && x < m && y >= 0 && y < n && matrix[x][y] > matrix[i][j]) {
                    indegree[x][y]++;
                }
            }
        }
    }
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (indegree[i][j] == 0) {
                queue.offer(new int[]{i, j});
            }
        }
    }
    int max = 0;
    while (!queue.isEmpty()) {
        max++;
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            int[] curr = queue.poll();
            for (int[] dir : directions) {
                int x = curr[0] + dir[0];
                int y = curr[1] + dir[1];
                if (x >= 0 && x < m && y >= 0 && y < n && matrix[x][y] < matrix[curr[0]][curr[1]] && --indegree[x][y] == 0) {
                    queue.offer(new int[]{x, y});
                }
            }
        }
    }
    return max;
}
