var poorPigs = function(buckets, minutesToDie, minutesToTest) {
       const test = (rounds, pigs) => Math.pow(rounds + 1, pigs) >= buckets ? pigs : test(rounds, pigs + 1);
       return test(Math.floor(minutesToTest / minutesToDie), 0);
   };