public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
    String str1 = s1.repeat(n1);
    String str2 = s2.repeat(n2);
    int count = 0;

    while (str1.contains(str2)) {
        str1 = str1.replaceFirst(str2, "");
        count++;
    }

    return count;
}
