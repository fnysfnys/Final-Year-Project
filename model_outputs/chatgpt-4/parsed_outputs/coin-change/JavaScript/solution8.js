/**
 * ... [Docstring as provided]
 */
var coinChange = function(coins, amount) {
    if (amount === 0) return 0;
    let dp = new Set([0]);

    let count = 0;
    while (dp.size) {
        count++;
        let newDp = new Set();
        for (let coin of coins) {
            for (let a of dp) {
                if (a + coin === amount) return count;
                if (a + coin < amount) newDp.add(a + coin);
            }
        }
        dp = newDp;
    }
    
    return -1;
};