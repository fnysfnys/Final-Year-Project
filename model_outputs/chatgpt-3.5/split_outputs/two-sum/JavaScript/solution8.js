/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    const result = [];
    nums.forEach((num, index) => {
        const complement = target - num;
        const foundIndex = nums.findIndex((n, i) => n === complement && i !== index);
        if (foundIndex !== -1) {
            result.push(index, foundIndex);
        }
    });
    return result;
};
