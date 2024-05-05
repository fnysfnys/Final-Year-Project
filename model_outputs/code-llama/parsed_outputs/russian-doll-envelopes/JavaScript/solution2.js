function maxEnvelopes(envelopes) {
   const sorted = envelopes.sort((a, b) => a[0] - b[0]);
   let max = 0;
   for (const [width, height] of sorted) {
       if (width > max) {
           max = height;
       }
   }
   return max;
}
