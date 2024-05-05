class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> result = new ArrayList<>();
        Set<String> wordSet = new HashSet<>(Arrays.asList(words));
        Map<String, Boolean> memo = new HashMap<>();
        
        for (String word : words) {
            wordSet.remove(word);
            if (isConcatenatedWord(word, wordSet, memo)) {
                result.add(word);
            }
            wordSet.add(word);
        }
        
        return result;
    }
    
    private boolean isConcatenatedWord(String word, Set<String> wordSet, Map<String, Boolean> memo) {
        if (memo.containsKey(word)) {
            return memo.get(word);
        }
        
        if (word.isEmpty()) {
            return false;
        }
        
        int n = word.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(word.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        
        memo.put(word, dp[n]);
        return dp[n];
    }
}
