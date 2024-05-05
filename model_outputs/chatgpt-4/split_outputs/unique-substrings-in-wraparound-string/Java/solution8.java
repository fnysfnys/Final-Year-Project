class Solution {
    public int findSubstringInWraproundString(String s) {
        int[] longest = new int[26];
        int currLength = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && (s.charAt(i) - s.charAt(i - 1) == 1 || s.charAt(i - 1) - s.charAt(i) == 25)) {
                currLength++;
            } else {
                currLength = 1;
            }
            int index = s.charAt(i) - 'a';
            longest[index] = Math.max(longest[index], currLength);
        }

        return IntStream.of(longest).sum();
    }
}
