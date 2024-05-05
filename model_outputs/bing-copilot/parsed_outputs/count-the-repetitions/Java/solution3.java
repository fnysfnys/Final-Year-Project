class Solution {
    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
            int[] lastOccurrence = new int[26];
            Arrays.fill(lastOccurrence, -1);
            for (int i = 0; i < s2.length(); i++) {
                lastOccurrence[s2.charAt(i) - 'a'] = i;
            }
            int count = 0, index = 0;
            for (int i = 0; i < n1; i++) {
                for (char c : s1.toCharArray()) {
                    if (lastOccurrence[c - 'a'] != -1) {
                        if (index == s2.length()) {
                            index = 0;
                            count++;
                        }
                        index = lastOccurrence[c - 'a'] + 1;
                    }
                }
            }
            return count / n2;
        }
        
}
