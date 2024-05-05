var maxProfit = function(prices) {
    const memo = new Map();
    
    function calculateMaxProfit(day, hasStock, cooldown) {
        if (day >= prices.length) return 0;
        const key = `${day}-${hasStock}-${cooldown}`;
        
        if (memo.has(key)) return memo.get(key);
        
        let maxProfit = 0;
        
        if (hasStock) {
            maxProfit = Math.max(
                calculateMaxProfit(day + 1, false, cooldown),
                calculateMaxProfit(day + 2, false, cooldown + prices[day])
            );
        } else {
            maxProfit = Math.max(
                calculateMaxProfit(day + 1, true, cooldown - prices[day]),
                calculateMaxProfit(day + 1, false, cooldown)
            );
        }
        
        memo.set(key, maxProfit);
        return maxProfit;
    }
    
    return calculateMaxProfit(0, false, 0);
};
