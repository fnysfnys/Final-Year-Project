function getRow(rowIndex) {
   let n = rowIndex + 1;
   let result = [];
   for (let i = 0; i < n; i++) {
       result.push(Math.pow(-1, i) * Math.pow(n - i, i) / factorial(i));
   }
   return result;
}

function factorial(n) {
   if (n === 0) {
       return 1;
   }
   return n * factorial(n - 1);
}
