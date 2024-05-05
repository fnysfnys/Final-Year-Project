function findAllConcatenatedWordsInADict(words) {
  const wordSet = new Set(words);
  const result = [];

  for (const word of words) {
    let isConcatenated = true;
    for (let i = 1; i < word.length; i++) {
      if (!wordSet.has(word.substring(0, i)) || !wordSet.has(word.substring(i))) {
        isConcatenated = false;
        break;
      }
    }
    if (isConcatenated) {
      result.push(word);
    }
  }

  return result;
}
