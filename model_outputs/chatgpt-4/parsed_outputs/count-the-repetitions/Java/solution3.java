class Solution {
    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        String str1 = s1.repeat(n1);
        int count = 0, j = 0;
    
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == s2.charAt(j)) {
                j++;
                if (j == s2.length()) {
                    j = 0;
                    count++;
                }
            }
        }
    
        return count / n2;
    }
}
