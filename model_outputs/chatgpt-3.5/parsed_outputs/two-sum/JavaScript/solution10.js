/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    const numSet = new Set();
    const result = [];
    nums.forEach((num, index) => {
        const complement = target - num;
        if (numSet.has(complement)) {
            result.push(nums.indexOf(complement), index);
        }
        numSet.add(num);
    });
    return result;
};