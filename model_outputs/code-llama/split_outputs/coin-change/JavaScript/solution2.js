function coinChange(coins, amount, minCoins = Infinity) {
   if (amount === 0) {
       return minCoins;
   }
   for (let i = 0; i < coins.length; i++) {
       let numCoins = Math.floor(amount / coins[i]);
       if (numCoins < minCoins) {
           minCoins = numCoins;
       }
   }
   return minCoins === Infinity ? -1 : minCoins;
}
