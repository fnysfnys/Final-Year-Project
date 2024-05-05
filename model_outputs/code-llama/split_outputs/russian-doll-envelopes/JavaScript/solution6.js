function maxEnvelopes(envelopes) {
   const sorted = envelopes.sort((a, b) => a[0] - b[0]);
   const map = new Map();
   for (const [width, height] of sorted) {
       map.set(width, height);
   }
   return Math.max(...map.values());
}
