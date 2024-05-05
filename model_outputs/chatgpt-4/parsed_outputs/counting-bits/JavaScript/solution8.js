var countBits = function(n) {
       return [...Array(n + 1)].reduce((acc, _, i) => {
           acc.push(i.toString(2).replace(/0/g, '').length);
           return acc;
       }, []);
   };