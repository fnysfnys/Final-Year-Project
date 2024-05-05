import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        Arrays.sort(words, Comparator.comparingInt(String::length));
        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (canFormUsingBinarySearch(words, i)) {
                result.add(words[i]);


            }
        }
        return result;
    }

    private boolean canFormUsingBinarySearch(String[] words, int index) {
        for (int i = 0; i < index; i++) {
            int start = 0;
            String word = words[index];
            while (start < word.length()) {
                int pos = Arrays.binarySearch(words, 0, i, word.substring(start));
                if (pos < 0) break;
                start += words[pos].length();
                if (start == word.length()) return true;
            }
        }
        return false;
    }
}
