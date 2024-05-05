class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
       Map<String, List<String>> concatenatedWords = new HashMap<>();
       Set<String> uniqueWords = new HashSet<>();
       for (String word : words) {
           if (word.length() > 1) {
               concatenatedWords.put(word, findConcatenatedWords(word, uniqueWords));
           }
       }
       return new ArrayList<>(concatenatedWords.values());
    }
    
    private List<String> findConcatenatedWords(String word, Set<String> uniqueWords) {
       List<String> concatenatedWords = new ArrayList<>();
       for (int i = 1; i < word.length(); i++) {
           String subWord = word.substring(0, i);
           if (uniqueWords.contains(subWord)) {
               concatenatedWords.add(word);
           }
       }
       return concatenatedWords;
    }
    
}
