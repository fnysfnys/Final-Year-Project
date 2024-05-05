function getRow(rowIndex) {
   if (rowIndex === 0) {
       return [1];
   }
   let previousRow = getRow(rowIndex - 1);
   let currentRow = [];
   for (let i = 0; i <= rowIndex; i++) {
       if (i === 0 || i === rowIndex) {
           currentRow.push(1);
       } else {
           currentRow.push(previousRow[i - 1] + previousRow[i]);
       }
   }
   return currentRow;
}
