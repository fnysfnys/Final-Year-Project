public int coinChange(int[] coins, int amount) {
   int low = 0;
   int high = amount;
   while (low <= high) {
       int mid = (low + high) / 2;
       int coinsNeeded = 0;
       for (int i = 0; i < coins.length; i++) {
           coinsNeeded += mid / coins[i];
           mid %= coins[i];
       }
       if (coinsNeeded == amount) {
           return mid;
       } else if (coinsNeeded < amount) {
           low = mid + 1;
       } else {
           high = mid - 1;
       }
   }
   return -1;
}
