function getRow(rowIndex) {
   let n = rowIndex + 1;
   let result = [];
   for (let i = 0; i < n; i++) {
       result.push(0);
   }
   let tree = [];
   for (let i = 0; i < n; i++) {
       tree.push([]);
       for (let j = 0; j < n; j++) {
           tree[i].push(0);
       }
   }
   for (let i = 0; i < n; i++) {
       for (let j = 0; j < n; j++) {
           if (i === j) {
               tree[i][j] = 1;
           } else {
               tree[i][j] = tree[i - 1][j - 1] + tree[i - 1][j];
           }
       }
   }
   for (let i = 0; i < n; i++) {
       for (let j = 0; j < n; j++) {
           result[i] += tree[i][j];
       }
   }
   return result;
}
