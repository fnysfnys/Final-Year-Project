public int longestIncreasingPath(int[][] matrix) {
    if (matrix == null || matrix.length == 0) return 0;
    int m = matrix.length, n = matrix[0].length;
    int[] parents = new int[m * n];
    int[] sizes = new int[m * n];
    Arrays.fill(parents, -1);
    int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            for (int[] dir : directions) {
                int x = i + dir[0];
                int y = j + dir[1];
                if (x >= 0 && x < m && y >= 0 && y < n && matrix[x][y] > matrix[i][j]) {
                    int id1 = i * n + j;
                    int id2 = x * n + y;
                    union(parents, sizes, id1, id2);
                }
            }
        }
    }
    int max = 0;
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            max = Math.max(max, sizes[i * n + j]);
        }
    }
    return max;
}

private int find(int[] parents, int i) {
    if (parents[i] == -1) return i;
    return find(parents, parents[i]);
}

private void union(int[] parents, int[] sizes, int i, int j) {
    int root1 = find(parents, i);
    int root2 = find(parents, j);
    if (root1 != root2) {
        parents[root1] = root2;
        sizes[root2] += sizes[root1];
    }
}
