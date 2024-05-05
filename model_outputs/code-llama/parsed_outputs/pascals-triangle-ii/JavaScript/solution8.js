function getRow(rowIndex) {
   let n = rowIndex + 1;
   let result = [];
   for (let i = 0; i < n; i++) {
       result.push(0);
   }
   let hash = {};
   for (let i = 0; i < n; i++) {
       hash[i] = 0;
   }
   for (let i = 0; i < n; i++) {
       for (let j = 0; j < n; j++) {
           if (i === j) {
               hash[i] = 1;
           } else {
               hash[i] += hash[j];
           }
       }
   }
   for (let i = 0; i < n; i++) {
       result[i] = hash[i];
   }
   return result;
}
