class Solution {
    public int findSubstringInWraproundString(String s) {
        return findSubstrings(s, 0, new HashMap<>());
    }

    private int findSubstrings(String s, int start, HashMap<String, Integer> memo) {
        if (start >= s.length()) return 0;
        if (memo.containsKey(s.substring(start))) return memo.get(s.substring(start));

        int count = 0;
        for (int end = start; end < s.length(); end++) {
            if (end == start || s.charAt(end) - s.charAt(end - 1) == 1 || s.charAt(end - 1) - s.charAt(end) == 25) {
                count += 1 + findSubstrings(s, end + 1, memo);
            } else {
                break;
            }
        }
        memo.put(s.substring(start), count);
        return count;
    }
}
