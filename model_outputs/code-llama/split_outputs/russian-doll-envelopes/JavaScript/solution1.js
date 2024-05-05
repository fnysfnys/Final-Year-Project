function maxEnvelopes(envelopes) {
   const hash = {};
   let max = 0;
   for (const [width, height] of envelopes) {
       if (!hash[width]) {
           hash[width] = height;
       } else if (hash[width] < height) {
           hash[width] = height;
       }
       max = Math.max(max, hash[width]);
   }
   return max;
}
