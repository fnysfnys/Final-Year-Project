public List<String> findAllConcatenatedWordsInADict(String[] words) {
   Set<String> concatenatedWords = new HashSet<>();
   for (String word : words) {
       if (word.length() > 1) {
           for (int i = 1; i < word.length(); i++) {
               String subWord = word.substring(0, i);
               if (concatenatedWords.contains(subWord)) {
                   concatenatedWords.add(word);
               }
           }
       }
   }
   return new ArrayList<>(concatenatedWords);
}
