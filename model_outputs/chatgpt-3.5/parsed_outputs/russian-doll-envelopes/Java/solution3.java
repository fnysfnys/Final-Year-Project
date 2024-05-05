class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (a, b) -> a[0] - b[0]);
        TreeMap<Integer, Integer> map = new TreeMap<>();
    
        for (int[] envelope : envelopes) {
            Integer lower = map.lowerKey(envelope[1]);
            if (lower != null) {
                map.put(envelope[1], map.get(lower) + 1);
            } else {
                map.put(envelope[1], 1);
            }
        }
    
        return map.isEmpty() ? 0 : map.lastEntry().getValue();
    }
}
