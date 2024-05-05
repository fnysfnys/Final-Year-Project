/**
 * @param {number} buckets
 * @param {number} minutesToDie
 * @param {number} minutesToTest
 * @return {number}
 */
var poorPigs = function(buckets, minutesToDie, minutesToTest) {
    return Math.ceil(Math.log2(buckets) / Math.log2(Math.floor(minutesToTest / minutesToDie) + 1));
};
