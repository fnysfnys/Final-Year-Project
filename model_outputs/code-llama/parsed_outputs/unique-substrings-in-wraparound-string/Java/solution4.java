class Solution {
    public int findSubstringInWraproundString(String s) {
       HashSet<String> substrings = new HashSet<>();
       HashMap<String, Integer> indices = new HashMap<>();
       for (int i = 0; i < s.length(); i++) {
           String substring = s.substring(i);
           if (!substrings.contains(substring)) {
               substrings.add(substring);
               indices.put(substring, i);
           }
       }
       return substrings.size();
    }
    
}
