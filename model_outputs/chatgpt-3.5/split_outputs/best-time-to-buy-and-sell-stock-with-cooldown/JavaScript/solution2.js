var maxProfit = function(prices) {
    let prevBuy = -prices[0];
    let prevSell = 0;
    let prevCooldown = 0;
    
    for (let i = 1; i < prices.length; i++) {
        const buy = Math.max(prevBuy, prevCooldown - prices[i]);
        const sell = Math.max(prevSell, prevBuy + prices[i]);
        const cooldown = Math.max(prevCooldown, prevSell);
        
        prevBuy = buy;
        prevSell = sell;
        prevCooldown = cooldown;
    }
    
    return Math.max(prevSell, prevCooldown);
};
