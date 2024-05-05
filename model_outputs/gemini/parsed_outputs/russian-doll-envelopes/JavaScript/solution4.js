function maxEnvelopes(envelopes) {
  // Sort envelopes by width ascending, height descending
  envelopes.sort((a, b) => a[0] === b[0] ? b[1] - a[1] : a[0] - b[0]);
  
  let dp = [];
  
  for (const [width, height] of envelopes) {
    const index = lowerBound(dp, height);
    if (index === dp.length) {
      dp.push(height);
    } else {
      dp[index] = height;
    }
  }
  
  return dp.length;
}

function lowerBound(arr, target) {
  let left = 0;
  let right = arr.length - 1;
  
  while (left < right) {
    const mid = Math.floor((left + right) / 2);
    if (arr[mid] >= target) {
      right = mid;
    } else {
      left = mid + 1;
    }
  }
  
  return left;
}
