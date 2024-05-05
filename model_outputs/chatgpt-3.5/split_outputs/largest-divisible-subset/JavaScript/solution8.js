var largestDivisibleSubset = function(nums) {
    nums.sort((a, b) => a - b);
    const n = nums.length;
    const subsets = Array(n).fill(null).map(() => new Set());

    for (let i = 0; i < n; i++) {
        for (let j = 0; j < i; j++) {
            if (nums[i

] % nums[j] === 0) {
                subsets[i].add(nums[j]);
            }
        }
    }

    let maxSubset = new Set();
    for (let i = 0; i < n; i++) {
        let currentSubset = new Set(subsets[i]);
        for (const num of subsets[i]) {
            if (currentSubset.size < subsets[i].size && currentSubset.has(num)) {
                currentSubset.delete(num);
            }
        }
        if (currentSubset.size + 1 > maxSubset.size) {
            maxSubset = new Set([...currentSubset, nums[i]]);
        }
    }

    return Array.from(maxSubset);
};
