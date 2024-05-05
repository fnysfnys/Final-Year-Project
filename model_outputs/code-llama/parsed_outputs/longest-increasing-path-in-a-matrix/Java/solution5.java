class Solution {
    public int longestIncreasingPath(int[][] matrix) {
       TreeMap<Integer, Integer> tree = new TreeMap<>();
       for (int i = 0; i < matrix.length; i++) {
           for (int j = 0; j < matrix[i].length; j++) {
               tree.put(matrix[i][j], 1);
           }
       }
       int maxPath = 0;
       for (int i = 0; i < matrix.length; i++) {
           for (int j = 0; j < matrix[i].length; j++) {
               maxPath = Math.max(maxPath, tree.get(matrix[i][j]));
           }
       }
       return maxPath;
    }
    
}
