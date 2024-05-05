var maxCoins = function(nums) {
    let memo = {};
    function dp(remaining) {
        let key = remaining.join(',');
        if (key in memo) return memo[key];

        let maxCoins = 0;
        for (let i = 0; i < remaining.length; i++) {
            let coins = (remaining[i - 1] || 1) * remaining[i] * (remaining[i + 1] || 1);
            let newRemaining = remaining.slice(0, i).concat(remaining.slice(i + 1));
            maxCoins = Math.max(maxCoins, coins + dp(newRemaining));
        }
        memo[key] = maxCoins;
        return maxCoins;
    }
    return dp(nums);
};