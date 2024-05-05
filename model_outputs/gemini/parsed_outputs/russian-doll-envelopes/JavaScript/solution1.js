function maxEnvelopes(envelopes) {
  // Sort envelopes by width ascending, height descending
  envelopes.sort((a, b) => a[0] === b[0] ? b[1] - a[1] : a[0] - b[0]);
  
  let count = 0;
  let lastWidth = Number.NEGATIVE_INFINITY;
  
  for (const [width, height] of envelopes) {
    if (width > lastWidth) {
      count++;
      lastWidth = width;
    }
  }
  
  return count;
}
