   // Helper function to find prime factors
   function primeFactors(num) {
       const factors = new Set();
       for (let i = 2; i * i <= num; i++) {
           while (num % i === 0) {
               factors.add(i);
               num /= i;
           }
       }
       if (num > 1) factors.add(num);
       return factors;
   }

   var largestDivisibleSubset = function(nums) {
       const factorMap = new Map();
       for (const num of nums) {
           const factors = Array.from(primeFactors(num));
           const key = factors.join(',');
           if (!factorMap.has(key)) factorMap.set(key, []);
           factorMap.get(key).push(num);
       }

       let maxSize = 0;
       let maxGroup = [];

       for (const group of factorMap.values()) {
           if (group.length > maxSize) {
               maxSize = group.length;
               maxGroup = group;
           }
       }

       return maxGroup;
   };
   