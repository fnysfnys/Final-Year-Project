var lengthOfLIS = function(nums) {
  const tails = [];

  for (const num of nums) {
    const i = binarySearch(tails, num);
    if (i < tails.length) {
      tails[i] = num;
    } else {
      tails.push(num);
    }
  }

  return tails.length;
};

function binarySearch(arr, n) {
  let left = 0;
  let right = arr.length - 1;

  while (left <= right) {
    const mid = Math.floor((left + right) / 2);
    if (arr[mid] === n) return mid;
    else if (arr[mid] < n) left = mid + 1;
    else right = mid - 1;
  }

  return left;
}
