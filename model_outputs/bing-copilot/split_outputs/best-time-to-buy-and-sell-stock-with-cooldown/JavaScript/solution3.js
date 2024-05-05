var maxProfit = function(prices) {
    const memo = new Map();
    const dfs = (i, hasStock, cooldown) => {
        if (i >= prices.length) return 0;
        const key = `${i}-${hasStock}-${cooldown}`;
        if (memo.has(key)) return memo.get(key);
        
        let maxProfit = dfs(i + 1, hasStock, cooldown);
        if (hasStock) {
            maxProfit = Math.max(maxProfit, prices[i] + dfs(i + 1, false, true));
        } else if (!cooldown) {
            maxProfit = Math.max(maxProfit, -prices[i] + dfs(i + 1, true, false));
        }
        
        memo.set(key, maxProfit);
        return maxProfit;
    };
    
    return dfs(0, false, false);
};
