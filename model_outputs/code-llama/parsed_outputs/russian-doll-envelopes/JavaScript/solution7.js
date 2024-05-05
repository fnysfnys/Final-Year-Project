function maxEnvelopes(envelopes) {
   const sorted = envelopes.sort((a, b) => a[0] - b[0]);
   const set = new Set();
   for (const [width, height] of sorted) {
       set.add(width);
   }
   return Math.max(...set.values());
}
