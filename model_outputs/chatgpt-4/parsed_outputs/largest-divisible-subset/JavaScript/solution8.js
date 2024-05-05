var largestDivisibleSubset = function(nums) {
    nums.sort((a, b) => a - b);
    let bestSubset = [];

    function isSubsetValid(subset) {
        for (let i = 0; i < subset.length; i++) {
            for (let j = i + 1; j < subset.length; j++) {
                if (subset[j] % subset[i] !== 0 && subset[i] % subset[j] !== 0) {
                    return false;
                }
            }
        }
        return true;
    }

    function findSubsets(index, currentSubset) {
        if (index === nums.length) {
            if (currentSubset.length > bestSubset.length && isSubsetValid(currentSubset)) {
                bestSubset = currentSubset.slice();
            }
            return;
        }
        currentSubset.push(nums[index]);
        findSubsets(index + 1, currentSubset);
        currentSubset.pop();
        findSubsets(index + 1, currentSubset);
    }

    findSubsets(0, []);
    return bestSubset;
};