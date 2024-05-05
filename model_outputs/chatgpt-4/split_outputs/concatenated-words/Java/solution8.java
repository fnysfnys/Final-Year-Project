import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        Set<String> wordSet = new HashSet<>();
        for (String word : words) {
            wordSet.add(word);
        }
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (divideAndConquer(word, wordSet)) {
                result.add(word);
            }
        }
        return result;
    }

    private boolean divideAndConquer(String word, Set<String> wordSet) {
        if (word.isEmpty()) return false;
        for (int i = 1; i < word.length(); i++) {
            String left = word.substring(0, i);
            String right = word.substring(i);
            if (wordSet.contains(left) && (wordSet.contains(right) || divideAndConquer(right, wordSet))) {
                return true;
            }
        }
        return false;
    }
}
