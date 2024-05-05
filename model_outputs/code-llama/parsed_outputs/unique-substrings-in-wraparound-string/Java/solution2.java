class Solution {
    public int findSubstringInWraproundString(String s) {
       HashMap<String, Integer> substrings = new HashMap<>();
       for (int i = 0; i < s.length(); i++) {
           String substring = s.substring(i);
           if (!substrings.containsKey(substring)) {
               substrings.put(substring, i);
           }
       }
       return substrings.size();
    }
    
}
