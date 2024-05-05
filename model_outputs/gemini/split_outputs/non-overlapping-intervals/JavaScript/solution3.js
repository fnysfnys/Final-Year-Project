function eraseOverlapIntervals(intervals) {
  intervals.sort((a, b) => a[0] - b[0]); // Sort by start time
  let count = mergeSort(intervals, 0, intervals.length - 1);
  return count;

  function mergeSort(arr, start, end) {
    if (start >= end) return 0;
    const mid = Math.floor((start + end) / 2);
    let countLeft = mergeSort(arr, start, mid);
    let countRight = mergeSort(arr, mid + 1, end);
    countLeft += merge(arr, start, mid, end);
    return countLeft + countRight;
  }

  function merge(arr, start, mid, end) {
    let count = 0;
    let i = start;
    let j = mid + 1;
    let k = start;
    const temp = [];
    while (i <= mid && j <= end) {
      if (arr[i][1] <= arr[j][0]) {
        temp[k++] = arr[i++];
      } else {
        count++; // Overlap occurs
        temp[k++] = arr[j++];
      }
    }
    while (i <= mid) temp[k++] = arr[i++];
    while (j <= end) temp[k++] = arr[j++];
    for (i = start; i <= end; i++) arr[i] = temp[i];
    return count;
  }
}
