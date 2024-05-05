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
   let queue = [];
   queue.push([i, j]);
   while (queue.length > 0) {
       let [x, y] = queue.shift();
       longestPath = Math.max(longestPath, findLongestPath(matrix, x - 1, y));
       longestPath = Math.max(longestPath, findLongestPath(matrix, x, y - 1));
       longestPath = Math.max(longestPath, findLongestPath(matrix, x + 1, y));
       longestPath = Math.max(longestPath, findLongestPath(matrix, x, y + 1));
   }
   return longestPath;
}
