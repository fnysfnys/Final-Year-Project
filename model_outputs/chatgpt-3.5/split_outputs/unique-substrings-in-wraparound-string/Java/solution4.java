class Solution {
    public int findSubstringInWraproundString(String s) {
        int[] maxLengthEndingHere = new int[26];
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && (s.charAt(i) - s.charAt(i - 1) == 1 || s.charAt(i - 1) - s.charAt(i) == 25)) {
                maxLen++;
            } else {
                maxLen = 1;
            }
            int index = s.charAt(i) - 'a';
            maxLengthEndingHere[index] = Math.max(maxLengthEndingHere[index], maxLen);
        }
        int sum = 0;
        for (int len : maxLengthEndingHere) {
            sum += len;
        }
        return sum;
    }
}
