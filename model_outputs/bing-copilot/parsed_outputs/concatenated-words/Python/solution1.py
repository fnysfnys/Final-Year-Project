class Solution:
    def findAllConcatenatedWordsInADict(self, words):
        def check(word, word_set, mem):
            if word in mem:
                return mem[word]
            mem[word] = False
            for i in range(1, len(word)):
                if word[:i] in word_set and (word[i:] in word_set or check(word[i:], word_set, mem)):
                    mem[word] = True
                    break
            return mem[word]

        mem = {}
        words_set = set(words)
        return [w for w in words if check(w, words_set, mem)]
