/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    const numMap = new Map();
    return nums.reduce((result, num, index) => {
        const complement = target - num;
        if (numMap.has(complement)) {
            result.push(numMap.get(complement), index);
        }
        numMap.set(num, index);
        return result;
    }, []);
};
