function getRow(rowIndex) {
   let row = [];
   for (let i = 0; i <= rowIndex; i++) {
       let currentRow = [];
       for (let j = 0; j <= i; j++) {
           if (j === 0 || j === i) {
               currentRow.push(1);
           } else {
               currentRow.push(row[i - 1][j - 1] + row[i - 1][j]);
           }
       }
       row.push(currentRow);
   }
   return row[rowIndex];
}
