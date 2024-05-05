   var poorPigs = function(buckets, minutesToDie, minutesToTest) {
       // Calculate how many rounds we can have
       let rounds = Math.floor(minutesToTest / minutesToDie);
       // Calculate the minimum number of pigs needed
       let pigs = 0;
       while (Math.pow(rounds + 1, pigs) < buckets) {
           pigs++;
       }
       return pigs;
   };
   