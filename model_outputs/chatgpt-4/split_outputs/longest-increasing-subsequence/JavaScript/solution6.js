var lengthOfLIS = function(nums) {
    const sub = [];
    for (const num of nums) {
        let i = 0, j = sub.length;
        while (i !== j) {
            const mid = Math.floor((i + j) / 2);
            if (sub[mid] < num) {
                i = mid + 1;
            } else {
                j = mid;
            }
        }
        if (i === sub.length) sub.push(num);
        else sub[i] = num;
    }
    return sub.length;
};
