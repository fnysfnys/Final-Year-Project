import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (canForm(word, words)) {
                result.add(word);
            }
        }
        return result;
    }

    private boolean canForm(String word, String[] words) {
        if (word.isEmpty()) return false;
        for (String w : words) {
            if (!w.equals(word) && word.startsWith(w)) {
                String suffix = word.substring(w.length());
                if (suffix.isEmpty() || canForm(suffix, words)) {
                    return true;
                }
            }
        }
        return false;
    }
}