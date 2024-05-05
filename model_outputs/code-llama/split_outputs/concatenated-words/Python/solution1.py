def findAllConcatenatedWordsInADict(words):
   concatenated_words = {}
   for word in words:
       if word in concatenated_words:
           continue
       for i in range(len(word)):
           if word[:i] in concatenated_words and word[i:] in concatenated_words:
               concatenated_words[word] = concatenated_words[word[:i]] + concatenated_words[word[i:]]
               break
   return list(concatenated_words.keys())
