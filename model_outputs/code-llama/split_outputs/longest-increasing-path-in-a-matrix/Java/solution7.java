public int longestIncreasingPath(int[][] matrix) {
   Graph graph = new Graph(matrix.length * matrix[0].length);
   for (int i = 0; i < matrix.length; i++) {
       for (int j = 0; j < matrix[i].length; j++) {
           graph.addEdge(i * matrix[0].length + j, matrix[i][j]);
       }
   }
   int maxPath = 0;
   for (int i = 0; i < matrix.length; i++) {
       for (int j = 0; j < matrix[i].length; j++) {
           maxPath = Math.max(maxPath, graph.getPathLength(i * matrix[0].length + j));
       }
   }
   return maxPath;
}
