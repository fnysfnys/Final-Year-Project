class Solution {
    public int maxEnvelopes(int[][] envelopes) {
      int n = envelopes.length;
      Arrays.sort(envelopes, (a, b) -> a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0]));
      List<Integer> heights = new ArrayList<>();
      heights.add(envelopes[0][1]);
      for (int i = 1; i < n; i++) {
        if (envelopes[i][1] > heights.get(heights.size() - 1)) {
          heights.add(envelopes[i][1]);
        } else {
          int index = Collections.binarySearch(heights, envelopes[i][1]);
          heights.set(index < 0 ? -index - 1 : index, envelopes[i][1]);
        }
      }
      return heights.size();
    }
    
}
