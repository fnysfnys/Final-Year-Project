function maxEnvelopes(envelopes) {
   const sorted = envelopes.sort((a, b) => a[0] - b[0]);
   const filtered = sorted.filter(([width, height]) => width > height);
   return Math.max(...filtered.map(([width, height]) => height));
}
