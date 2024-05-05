class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
       Map<String, List<String>> concatenatedWords = new HashMap<>();
       for (String word : words) {
           if (word.length() > 1) {
               for (int i = 1; i < word.length(); i++) {
                   String subWord = word.substring(0, i);
                   if (concatenatedWords.containsKey(subWord)) {
                       concatenatedWords.get(subWord).add(word);
                   }
               }
           }
       }
       return new ArrayList<>(concatenatedWords.values());
    }
    
}
