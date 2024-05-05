def findAllConcatenatedWordsInADict(words):
   concatenated_words = []
   for word in words:
       if word in concatenated_words:
           continue
       for i in range(len(word)):
           if word[:i] in concatenated_words and word[i:] in concatenated_words:
               concatenated_words.append(word)
               break
   return concatenated_words
