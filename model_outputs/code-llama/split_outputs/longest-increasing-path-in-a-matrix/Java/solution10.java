public int longestIncreasingPath(int[][] matrix) {
   WaveletTree waveletTree = new WaveletTree(matrix);
   int maxPath = 0;
   for (int i = 0; i < matrix.length; i++) {
       for (int j = 0; j < matrix[i].length; j++) {
           maxPath = Math.max(maxPath, waveletTree.getPathLength(matrix[i][j]));
       }
   }
   return maxPath;
}
