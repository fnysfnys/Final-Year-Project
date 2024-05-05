function findAllConcatenatedWordsInADict(words) {
  const wordSet = new Set(words);
  const result = [];

  function backtrack(word, start, used) {
    if (start === word.length) {
      result.push(word);
      return;
    }

    for (let i = start; i < word.length; i++) {
      const prefix = word.substring(start, i + 1);
      if (wordSet.has(prefix) && !used[i]) {
        used[i] = true;
        backtrack(word, i + 1, used);
        used[i] = false;
      }
    }
  }

  for (const word of words) {
    backtrack(word, 0, new Array(word.length).fill(false));
  }

  return result;
}
