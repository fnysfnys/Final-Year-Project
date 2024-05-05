   var poorPigs = function(buckets, minutesToDie, minutesToTest) {
       let rounds = Math.floor(minutesToTest / minutesToDie);
       let pigs = 0;
       while ((1 << pigs) < Math.pow(rounds + 1, pigs)) {
           pigs++;
       }
       return pigs;
   };
   