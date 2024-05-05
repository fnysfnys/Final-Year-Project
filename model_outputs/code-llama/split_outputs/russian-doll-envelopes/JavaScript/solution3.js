function maxEnvelopes(envelopes) {
   const sorted = envelopes.sort((a, b) => a[0] - b[0]);
   let max = 0;
   for (const [width, height] of sorted) {
       const index = binarySearch(sorted, width);
       if (index > -1) {
           max = Math.max(max, height);
       }
   }
   return max;
}

function binarySearch(arr, target) {
   let left = 0;
   let right = arr.length - 1;
   while (left <= right) {
       const mid = (left + right) >>> 1;
       if (arr[mid][0] === target) {
           return mid;
       } else if (arr[mid][0] < target) {
           left = mid + 1;
       } else {
           right = mid - 1;
       }
   }
   return -1;
}
