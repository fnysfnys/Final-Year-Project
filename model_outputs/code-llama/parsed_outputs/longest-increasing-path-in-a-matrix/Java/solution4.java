class Solution {
    public int longestIncreasingPath(int[][] matrix) {
       Queue<Integer> queue = new LinkedList<>();
       for (int i = 0; i < matrix.length; i++) {
           for (int j = 0; j < matrix[i].length; j++) {
               queue.add(matrix[i][j]);
           }
       }
       int maxPath = 0;
       while (!queue.isEmpty()) {
           int current = queue.poll();
           if (current > queue.peek()) {
               maxPath = Math.max(maxPath, current);
           }
       }
       return maxPath;
    }
    
}
