/**
 * @param {number[]} nums
 * @return {number}
 */
var lengthOfLIS = function(nums) {
    const stack = [];
    
    for (const num of nums) {
        if (stack.length === 0 || num > stack[stack.length - 1]) {
            stack.push(num);
        } else {
            let left = 0, right = stack.length - 1;
            while (left < right) {
                const mid = Math.floor((left + right) / 2);
                if (stack[mid] < num) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            stack[left] = num;
        }
    }
    
    return stack.length;
};
