public int longestIncreasingPath(int[][] matrix) {
    if (matrix == null || matrix.length == 0) return 0;
    int m = matrix.length, n = matrix[0].length;
    Queue<int[]> queue = new LinkedList<>();
    int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    int[][] maxPath = new int[m][n];
    int max = 0;
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            int currMax = 1;
            queue.offer(new int[]{i, j});
            while (!queue.isEmpty()) {
                int[] curr = queue.poll();
                for (int[] dir : directions) {
                    int x = curr[0] + dir[0];


                    int y = curr[1] + dir[1];
                    if (x >= 0 && x < m && y >= 0 && y < n && matrix[x][y] > matrix[curr[0]][curr[1]]) {
                        maxPath[x][y] = Math.max(maxPath[x][y], currMax + 1);
                        queue.offer(new int[]{x, y});
                    }
                }
                currMax = Math.max(currMax, maxPath[curr[0]][curr[1]]);
            }
            max = Math.max(max, currMax);
        }
    }
    return max;
}
