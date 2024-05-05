function getRow(rowIndex) {
   let n = rowIndex + 1;
   let result = [];
   for (let i = 0; i < n; i++) {
       result.push(0);
   }
   for (let i = 0; i < n; i++) {
       let left = 0;
       let right = n - 1;
       while (left <= right) {
           let mid = Math.floor((left + right) / 2);
           if (i === mid) {
               result[i] = 1;
               break;
           } else if (i < mid) {
               right = mid - 1;
           } else {
               left = mid + 1;
           }
       }
   }
   return result;
}
