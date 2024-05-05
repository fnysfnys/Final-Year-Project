class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
       List<String> concatenatedWords = new ArrayList<>();
       for (String word : words) {
           if (word.length() > 1) {
               concatenatedWords.addAll(findConcatenatedWords(word));
           }
       }
       return concatenatedWords;
    }
    
    private List<String> findConcatenatedWords(String word) {
       List<String> concatenatedWords = new ArrayList<>();
       for (int i = 1; i < word.length(); i++) {
           String subWord = word.substring(0, i);
           if (concatenatedWords.contains(subWord)) {
               concatenatedWords.add(word);
           }
       }
       return concatenatedWords;
    }
    
}
