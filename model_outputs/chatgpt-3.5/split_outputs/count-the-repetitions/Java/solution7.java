public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
    StringBuilder str1 = new StringBuilder(s1);
    StringBuilder str2 = new StringBuilder(s2);
    str1.setLength(n1 * s1.length());
    str2.setLength(n2 * s2.length());
    int count = 0;
    int index = 0;

    for (int i = 0; i < str1.length(); i++) {
        if (str1.charAt(i) == str2.charAt(index)) {
            index++;
            if (index == str2.length()) {
                index = 0;
                count++;
            }
        }
    }

    return count / n2;
}
