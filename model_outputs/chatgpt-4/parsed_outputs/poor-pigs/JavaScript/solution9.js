const poorPigs = (buckets, minutesToDie, minutesToTest) => 
       Math.ceil(Math.log(buckets) / Math.log(Math.floor(minutesToTest / minutesToDie) + 1));