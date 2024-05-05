function maxEnvelopes(envelopes) {
   const sorted = envelopes.sort((a, b) => a[0] - b[0]);
   let max = 0;
   for (const [width, height] of sorted) {
       max = Math.max(max, height);
       const index = sorted.indexOf(width);
       if (index > -1) {
           max = Math.max(max, height);
       }
   }
   return max;
}
