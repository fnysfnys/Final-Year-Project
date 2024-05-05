public int maxEnvelopes(int[][] envelopes) {
  int n = envelopes.length;
  int[] arr = new int[n];
  int index = 0;
  for (int[] envelope : envelopes) {
    int j = Collections.binarySearch(Arrays.asList(arr).subList(0, index), envelope[1]);
    if (j < 0) {
      j = -j - 1;
    }
    if (j == index) {
      index++;
    }
    arr[j] = envelope[1];
  }
  return index;
}
