public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
    char[] s1Chars = s1.toCharArray();
    char[] s2Chars = s2.toCharArray();
    int s1Len = s1Chars.length;
    int s2Len = s2Chars.length;
    int count = 0;
    int index = 0;

    for (int i = 0; i < n1; i++) {
        for (int j = 0; j < s1Len; j++) {
            if (s1Chars[j] == s2Chars[index]) {
                index++;
                if (index == s2Len) {
                    index = 0;
                    count++;
                }
            }
        }
    }

    return count / n2;
}
