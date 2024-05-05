function findSubstringInWraproundString(s) {
  const trie = {};
  
  function insert(word) {
    let node = trie;
    for (const char of word) {
      node[char] = node[char] || {};
      node = node[char];
    }
    node.isWord = true;
  }
  
  function search(word) {
    let node = trie;
    for (const char of word) {
      if (!node[char]) return false;
      node = node[char];
    }
    return node.isWord;
  }
  
  const suffixes = s.split('').map((_, i) => s.slice(i)).sort();
  
  for (const suffix of suffixes) {
    if (search(suffix)) {
      continue;
    }
    insert(suffix);
    let prefix = suffix.slice(1);
    while (prefix.length > 0 && !search(prefix)) {
      prefix = prefix.slice(1);
    }
  }
  
  let count = 0;
  function dfs(node) {
    count += node.isWord ? 1 : 0;
    for (const char of Object.keys(node)) {
      dfs(node[char]);
    }
  }
  
  dfs(trie);
  return count;
}
