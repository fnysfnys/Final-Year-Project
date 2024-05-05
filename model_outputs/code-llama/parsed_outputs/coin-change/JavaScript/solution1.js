function coinChange(coins, amount) {
   let minCoins = Infinity;
   for (let i = 0; i < coins.length; i++) {
       let numCoins = Math.floor(amount / coins[i]);
       if (numCoins < minCoins) {
           minCoins = numCoins;
       }
   }
   return minCoins === Infinity ? -1 : minCoins;
}
