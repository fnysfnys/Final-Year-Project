var lengthOfLIS = function(nums) {
    const tails = [];
    for (const num of nums) {
        let i = 0, j = tails.length;
        while (i < j) {
            const m = Math.floor((i + j) / 2);
            if (tails[m] < num) {
                i = m + 1;
            } else {
                j = m;
            }
        }
        tails[i] = num;
        if (i === tails.length) tails.push(num);
    }
    return tails.length;
};
