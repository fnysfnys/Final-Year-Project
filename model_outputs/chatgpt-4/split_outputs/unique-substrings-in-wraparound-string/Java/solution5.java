class Solution {
    public int findSubstringInWraproundString(String s) {
        BitSet visited = new BitSet(26);
        int maxLengthCurChar = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {


            if (i > 0 && (s.charAt(i) - s.charAt(i - 1) == 1 || s.charAt(i - 1) - s.charAt(i) == 25)) {
                maxLengthCurChar++;
            } else {
                maxLengthCurChar = 1;
            }

            int index = s.charAt(i) - 'a';
            for (int j = 0; j < maxLengthCurChar; j++) {
                if (!visited.get((index - j + 26) % 26)) {
                    visited.set((index - j + 26) % 26);
                    count++;
                }
            }
        }

        return count;
    }
}
