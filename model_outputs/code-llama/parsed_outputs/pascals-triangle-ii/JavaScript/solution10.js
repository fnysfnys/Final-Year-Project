function getRow(rowIndex) {
   let n = rowIndex + 1;
   let result = [];
   for (let i = 0; i < n; i++) {
       result.push(0);
   }
   let graph = [];
   for (let i = 0; i < n; i++) {
       graph.push([]);
       for (let j = 0; j < n; j++) {
           graph[i].push(0);
       }
   }
   for (let i = 0; i < n; i++) {
       for (let j = 0; j < n; j++) {
           if (i === j) {
               graph[i][j] = 1;
           } else {
               graph[i][j] = graph[i - 1][j - 1] + graph[i - 1][j];
           }
       }
   }
   for (let i = 0; i < n; i++) {
       for (let j = 0; j < n; j++) {
           result[i] += graph[i][j];
       }
   }
   return result;
}
