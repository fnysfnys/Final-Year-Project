function canCross(stones) {
   const queue = [stones[0]];
   while (queue.length > 0) {
       const stone = queue.shift();
       if (stone === stones[stones.length - 1]) {
           return true;
       }
       for (let i = 0; i < stones.length; i++) {
           if (stones[i] - stone > 1) {
               continue;
           }
           queue.push(stones[i]);
       }
   }
   return false;
}
