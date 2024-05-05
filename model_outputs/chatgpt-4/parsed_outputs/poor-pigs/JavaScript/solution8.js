var poorPigs = function(buckets, minutesToDie, minutesToTest) {
       if (minutesToDie > minutesToTest) {
           throw new Error('Invalid input: minutesToDie cannot be greater than minutesToTest');
       }
       return Math.ceil(Math.log(buckets) / Math.log(Math.floor(minutesToTest / minutesToDie) + 1));
   };