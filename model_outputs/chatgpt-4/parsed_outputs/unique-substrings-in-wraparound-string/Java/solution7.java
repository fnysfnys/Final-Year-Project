class Solution {
    public int findSubstringInWraproundString(String s) {
        int[] count = new int[26];
        int maxLength = 0;

        for (int i = 0, j = 0; i < s.length(); i++) {
            if (i > 0 && (s.charAt(i) - s.charAt(i - 1) != 1 && s.charAt(i - 1) - s.charAt(i) != 25)) {
                j = i;
            }
            maxLength = Math.max(maxLength, i - j + 1);
            count[s.charAt(i) - 'a'] = Math.max(count[s.charAt(i) - 'a'], maxLength);
        }

        return Arrays.stream(count).sum();
    }
}