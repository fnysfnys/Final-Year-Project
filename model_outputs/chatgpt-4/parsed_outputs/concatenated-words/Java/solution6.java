import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        Set<String> wordSet = new HashSet<>();
        for (String word : words) {
            wordSet.add(word);
        }
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (bfs(word, wordSet)) {
                result.add(word);
            }
        }
        return result;
    }

    private boolean bfs(String word, Set<String> wordSet) {
        if (word.isEmpty()) return false;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        boolean[] visited = new boolean[word.length()];
        while (!queue.isEmpty()) {
            int start = queue.poll();
            if (visited[start]) continue;
            for (int end = start + 1; end <= word.length(); end++) {
                if (wordSet.contains(word.substring(start, end))) {
                    if (end == word.length()) return true;
                    queue.add(end);
                }
            }
            visited[start] = true;
        }
        return false;
    }
}
