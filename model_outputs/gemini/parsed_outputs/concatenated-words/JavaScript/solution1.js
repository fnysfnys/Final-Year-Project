function findAllConcatenatedWordsInADict(words) {
  const trie = {};

  for (const word of words) {
    let node = trie;
    for (const char of word) {
      node[char] = node[char] || {};
      node = node[char];
    }
    node.isWord = true;
  }

  const result = [];
  for (const word of words) {
    if (canFormWord(trie, word, 0)) {
      result.push(word);
    }
  }

  return result;
}

function canFormWord(trie, word, index) {
  if (index === word.length) {
    return true;
  }

  const node = trie[word[index]];
  if (!node) {
    return false;
  }

  return node.isWord && (canFormWord(trie, word, index + 1) || canFormWord(trie, word, index + 1));
}
