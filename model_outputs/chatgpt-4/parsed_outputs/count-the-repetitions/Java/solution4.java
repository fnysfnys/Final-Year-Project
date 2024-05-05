class Solution {
    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        String str1 = s1.repeat(n1);
        String regex = s2.repeat(n2).replace("", ".*");
        return str1.matches(regex) ? 1 : 0;
    }
}
