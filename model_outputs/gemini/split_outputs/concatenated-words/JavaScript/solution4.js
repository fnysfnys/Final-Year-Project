function findAllConcatenatedWordsInADict(words) {
  const dp = new Array(words.length).fill(false);
  const wordSet = new Set(words);

  for (let i = 0; i < words.length; i++) {
    const word = words[i];
    for (let j = 0; j < word.length; j++) {
      const prefix = word.substring(0, j + 1);
      if (wordSet.has(prefix) && (j === 0 || dp[i - j])) {
        dp[i] = true;
        break;
      }
    }
  }

  const result = [];
  for (let i = 0; i < words.length; i++) {
    if (dp[i]) {
      result.push(words[i]);
    }
  }

  return result;
}
