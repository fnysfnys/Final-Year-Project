class Solution {
    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        String str1 = s1.repeat(n1);
        String str2 = s2.repeat(n2);
        int i = 0, j = 0, count = 0;
    
        while (i < str1.length()) {
            if (str1.charAt(i) == str2.charAt(j)) {
                j++;
                if (j == str2.length()) {
                    count++;
                    j = 0;
                }
            }
            i++;
        }
    
        return count;
    }
}
