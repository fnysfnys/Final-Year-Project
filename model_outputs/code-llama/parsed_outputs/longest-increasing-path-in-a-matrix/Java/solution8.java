class Solution {
    public int longestIncreasingPath(int[][] matrix) {
       Trie trie = new Trie();
       for (int i = 0; i < matrix.length; i++) {
           for (int j = 0; j < matrix[i].length; j++) {
               trie.insert(matrix[i][j]);
           }
       }
       int maxPath = 0;
       for (int i = 0; i < matrix.length; i++) {
           for (int j = 0; j < matrix[i].length; j++) {
               maxPath = Math.max(maxPath, trie.getPathLength(matrix[i][j]));
           }
       }
       return maxPath;
    }
    
}
