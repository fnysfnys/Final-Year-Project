public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
    String str1 = s1.repeat(n1);
    int[] index = new int[s2.length()];
    int count = 0, j = 0;

    for (int i = 0; i < str1.length(); i++) {
        if (str1.charAt(i) == s2.charAt(j)) {
            index[j] = i;
            j++;
            if (j == s2.length()) {
                j = 0;
                count++;
                i = index[0]; // reset i to the start of the subsequence
            }
        }
    }

    return count / n2;
}
