public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
    String str1 = s1.repeat(n1);
    String str2 = s2.repeat(n2);
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
