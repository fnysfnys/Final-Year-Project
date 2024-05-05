   var countNumbersWithUniqueDigits = function(n) {
       if (n === 0) return 1;
       const uniqueDigits = (num, used) => {
           if (num > Math.pow(10, n)) return 0;
           let count = 1;
           for (let i = 0; i < 10; i++) {
               if (!used[i]) {
                   used[i] = true;
                   count += uniqueDigits(num * 10 + i, used);
                   used[i] = false;
               }
           }
           return count;
       };
       return uniqueDigits(0, Array(10).fill(false));
   };
   