class Solution {
    public int longestIncreasingPath(int[][] matrix) {
       SuffixTree suffixTree = new SuffixTree(matrix);
       int maxPath = 0;
       for (int i = 0; i < matrix.length; i++) {
           for (int j = 0; j < matrix[i].length; j++) {
               maxPath = Math.max(maxPath, suffixTree.getPathLength(matrix[i][j]));
           }
       }
       return maxPath;
    }
    
}
