function maxEnvelopes(envelopes) {
   const sorted = envelopes.sort((a, b) => a[0] - b[0]);
   const found = sorted.find(([width, height]) => width > height);
   return found ? found[1] : 0;
}
