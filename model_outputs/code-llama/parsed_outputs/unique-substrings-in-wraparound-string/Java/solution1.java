class Solution {
    public int findSubstringInWraproundString(String s) {
       HashSet<String> substrings = new HashSet<>();
       for (int i = 0; i < s.length(); i++) {
           String substring = s.substring(i);
           if (!substrings.contains(substring)) {
               substrings.add(substring);
           }
       }
       return substrings.size();
    }
    
}
