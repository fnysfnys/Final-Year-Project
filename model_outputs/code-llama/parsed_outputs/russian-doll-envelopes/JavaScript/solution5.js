function maxEnvelopes(envelopes) {
   const sorted = envelopes.sort((a, b) => a[0] - b[0]);
   return sorted.reduce((max, [width, height]) => Math.max(max, height), 0);
}
