var lengthOfLIS = function(nums) {
    const tails = [];
    for (const num of nums) {
        const idx = tails.findIndex(t => t >= num);
        if (idx === -1) tails.push(num);
        else tails[idx] = num;
    }
    return tails.length;
};
