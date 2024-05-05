public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
    StringBuilder sb1 = new StringBuilder();
    for (int i = 0; i < n1; i++) {
        sb1.append(s1);
    }

    StringBuilder sb2 = new StringBuilder();
    for (int i = 0; i < n2; i++) {
        sb2.append(s2);
    }

    int count = 0;
    String str2 = sb2.toString();
    int index;
    while ((index = sb1.indexOf(str2)) != -1) {
        sb1.delete(index, index + str2.length());
        count++;
    }

    return count;
}
