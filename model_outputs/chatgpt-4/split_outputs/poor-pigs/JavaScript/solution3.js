   var poorPigs = function(buckets, minutesToDie, minutesToTest) {
       let pigs = 0;
       for (; Math.pow(minutesToTest / minutesToDie + 1, pigs) < buckets; pigs++);
       return pigs;
   };
   