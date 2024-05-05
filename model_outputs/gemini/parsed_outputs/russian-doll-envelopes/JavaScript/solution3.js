function maxEnvelopes(envelopes) {
  // Sort envelopes by width ascending, height descending
  envelopes.sort((a, b) => a[0] === b[0] ? b[1] - a[1] : a[0] - b[0]);
  
  let prev1 = prev2 = 1;
  let max = 1;
  
  for (let i = 1; i < envelopes.length; i++) {
    let temp = 1;
    for (let j = 0; j < i; j++) {
      if (envelopes[i][0] > envelopes[j][0] && envelopes[i][1] > envelopes[j][1]) {
        temp = Math.max(temp, prev1 + 1);
      }
    }
    max = Math.max(max, temp);
    prev2 = prev1;
    prev1 = temp;
  }
  
  return max;
}
