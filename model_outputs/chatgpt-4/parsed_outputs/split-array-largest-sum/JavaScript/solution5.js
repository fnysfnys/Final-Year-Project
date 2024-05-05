var splitArray = function(nums, k) {
    function getMaxSum(subarrays) {
        return Math.max(...subarrays.map(subarray => subarray.reduce((a, b) => a + b, 0)));
    }

    function split(start, k) {
        if (k == 1) return [nums.slice(start)];

        let results = [];
        for (let i = start + 1; i <= nums.length - k + 1; i++) {
            let firstPart = nums.slice(start, i);
            let partitions = split(i, k - 1);

            for

(let part of partitions) {
                results.push([firstPart, ...part]);
            }
        }
        return results;
    }

    let allPossibleSplits = split(0, k);
    return Math.min(...allPossibleSplits.map(getMaxSum));
};