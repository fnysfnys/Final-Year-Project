function getRow(rowIndex) {
   let memo = [];
   function helper(rowIndex) {
       if (rowIndex === 0) {
           return [1];
       }
       if (memo[rowIndex]) {
           return memo[rowIndex];
       }
       let previousRow = helper(rowIndex - 1);
       let currentRow = [];
       for (let i = 0; i <= rowIndex; i++) {
           if (i === 0 || i === rowIndex) {
               currentRow.push(1);
           } else {
               currentRow.push(previousRow[i - 1] + previousRow[i]);
           }
       }
       memo[rowIndex] = currentRow;
       return currentRow;
   }
   return helper(rowIndex);
}
