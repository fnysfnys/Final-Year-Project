   var poorPigs = function(buckets, minutesToDie, minutesToTest) {
       let rounds = Math.floor(minutesToTest / minutesToDie);
       return Math.ceil(Math.log(buckets) / Math.log(rounds + 1));
   };
   