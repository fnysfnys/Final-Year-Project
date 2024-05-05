function getRow(rowIndex) {
   let n = rowIndex + 1;
   let identityMatrix = [];
   for (let i = 0; i < n; i++) {
       identityMatrix.push([]);
       for (let j = 0; j < n; j++) {
           if (i === j) {
               identityMatrix[i].push(1);
           } else {
               identityMatrix[i].push(0);
           }
       }
   }
   let result = [];
   for (let i = 0; i < n; i++) {
       result.push([]);
       for (let j = 0; j < n; j++) {
           result[i].push(0);
       }
   }
   for (let i = 0; i < n; i++) {
       for (let j = 0; j < n; j++) {
           for (let k = 0; k < n; k++) {
               result[i][j] += identityMatrix[i][k] * identityMatrix[k][j];
           }
       }
   }
   return result;
}
