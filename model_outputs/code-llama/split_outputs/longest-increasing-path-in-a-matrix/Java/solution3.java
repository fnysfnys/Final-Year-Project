public int longestIncreasingPath(int[][] matrix) {
   Stack<Integer> stack = new Stack<>();
   for (int i = 0; i < matrix.length; i++) {
       for (int j = 0; j < matrix[i].length; j++) {
           stack.push(matrix[i][j]);
       }
   }
   int maxPath = 0;
   while (!stack.isEmpty()) {
       int current = stack.pop();
       if (current > stack.peek()) {
           maxPath = Math.max(maxPath, current);
       }
   }
   return maxPath;
}
