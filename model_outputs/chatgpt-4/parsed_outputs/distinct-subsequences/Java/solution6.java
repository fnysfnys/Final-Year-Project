class Solution {
    public int numDistinct(String s, String t) {
        return (int) IntStream.rangeClosed(0, s.length() - t.length())
                .mapToObj(i -> s.substring(i))
                .filter(sub -> sub.startsWith(t.substring(0, 1)))
                .count();
    }
    
}
