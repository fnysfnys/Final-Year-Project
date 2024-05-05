var maxCoins = function(nums) {
    function burst(remaining) {
        if (remaining.length === 0) return 0;

        let maxCoins = 0;
        for (let i = 0; i < remaining.length; i++) {
            let coins = (remaining[i - 1] || 1) * remaining[i] * (remaining[i + 1] || 1);
            let newRemaining = remaining.slice(0, i).concat(remaining.slice(i + 1));
            maxCoins = Math.max(maxCoins, coins + burst(newRemaining));
        }
        return maxCoins;
    }
    return burst(nums);
};
