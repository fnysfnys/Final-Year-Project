public int longestIncreasingPath(int[][] matrix) {
   int maxPath = 0;
   for (int i = 0; i < matrix.length; i++) {
       for (int j = 0; j < matrix[i].length; j++) {
           maxPath = Math.max(maxPath, longestIncreasingPath(matrix, i, j));
       }
   }
   return maxPath;
}

private int longestIncreasingPath(int[][] matrix, int i, int j) {
   int maxPath = 0;
   for (int k = 0; k < matrix[i].length; k++) {
       if (matrix[i][k] > matrix[i][j]) {
           maxPath = Math.max(maxPath, longestIncreasingPath(matrix, i, k));
       }
   }
   return maxPath;
}
