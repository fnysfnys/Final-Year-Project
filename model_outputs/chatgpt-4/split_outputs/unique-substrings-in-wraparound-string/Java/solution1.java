class Solution {
    public int findSubstringInWraproundString(String s) {
        boolean[] visited = new boolean[26];
        int maxLengthCurChar = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && (s.charAt(i) - s.charAt(i - 1) == 1 || s.charAt(i - 1) - s.charAt(i) == 25)) {
                maxLengthCurChar++;
            } else {
                maxLengthCurChar = 1;
            }

            int index = s.charAt(i) - 'a';
            if (maxLengthCurChar > visited[index]) {
                count += maxLengthCurChar - visited[index];
                visited[index] = maxLengthCurChar;
            }
        }

        return count;
    }
}
