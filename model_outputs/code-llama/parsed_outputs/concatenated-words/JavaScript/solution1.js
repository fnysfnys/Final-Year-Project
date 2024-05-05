function findAllConcatenatedWordsInADict(words) {
   const concatenatedWords = new Set();
   for (let i = 0; i < words.length; i++) {
       const word = words[i];
       for (let j = 0; j < words.length; j++) {
           if (j !== i && word.includes(words[j])) {
               concatenatedWords.add(word);
               break;
           }
       }
   }
   return [...concatenatedWords];
}
