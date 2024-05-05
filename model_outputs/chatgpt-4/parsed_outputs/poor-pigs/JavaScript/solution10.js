var poorPigs = function(buckets, minutesToDie, minutesToTest) {
        if (buckets < 1 || minutesToDie < 1 || minutesToTest < 1) {
            throw new Error('All input values must be greater than 0');
        }
        let rounds = Math.floor(minutesToTest / minutesToDie);
        return Math.ceil(Math.log(buckets) / Math.log(rounds + 1));
    };