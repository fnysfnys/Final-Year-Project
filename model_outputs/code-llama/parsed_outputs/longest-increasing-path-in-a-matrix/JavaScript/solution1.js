function longestIncreasingPath(matrix) {
   let longestPath = 0;
   for (let i = 0; i < matrix.length; i++) {
       for (let j = 0; j < matrix[i].length; j++) {
           longestPath = Math.max(longestPath, findLongestPath(matrix, i, j));
       }
   }
   return longestPath;
}

function findLongestPath(matrix, i, j) {
   let longestPath = 0;
   if (i < 0 || j < 0 || i >= matrix.length || j >= matrix[i].length) {
       return longestPath;
   }
   longestPath = Math.max(longestPath, findLongestPath(matrix, i - 1, j));
   longestPath = Math.max(longestPath, findLongestPath(matrix, i, j - 1));
   longestPath = Math.max(longestPath, findLongestPath(matrix, i + 1, j));
   longestPath = Math.max(longestPath, findLongestPath(matrix, i, j + 1));
   return longestPath;
}
