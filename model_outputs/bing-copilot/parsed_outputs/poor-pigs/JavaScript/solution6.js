var poorPigs = (buckets, minutesToDie, minutesToTest) =>
    Math.ceil(Math.log2(buckets) / Math.log2(minutesToTest / minutesToDie + 1));
