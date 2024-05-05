public int longestIncreasingPath(int[][] matrix) {
   HashMap<Integer, Integer> hash = new HashMap<>();
   for (int i = 0; i < matrix.length; i++) {
       for (int j = 0; j < matrix[i].length; j++) {
           hash.put(matrix[i][j], 1);
       }
   }
   int maxPath = 0;
   for (int i = 0; i < matrix.length; i++) {
       for (int j = 0; j < matrix[i].length; j++) {
           maxPath = Math.max(maxPath, hash.get(matrix[i][j]));
       }
   }
   return maxPath;
}
