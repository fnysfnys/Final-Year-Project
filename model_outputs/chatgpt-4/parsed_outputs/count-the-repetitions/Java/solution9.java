class Solution {
    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        String str1 = s1.repeat(n1);
        String str2 = s2.repeat(n2);
        
        return (int) str1.chars().filter(ch -> ch == str2.charAt(0)).count() / str2.length();
    }
}
