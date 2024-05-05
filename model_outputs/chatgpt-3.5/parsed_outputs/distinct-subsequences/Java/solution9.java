class Solution {
    public int numDistinct(String s, String t) {
        int count = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
    
        while (!stack.isEmpty()) {
            int sIndex = stack.pop();
            int tIndex = stack.size();
    
            if (tIndex == t.length()) {
                count++;
            } else if (sIndex < s.length()) {
                if (s.charAt(sIndex) == t.charAt(tIndex)) {
                    stack.push(sIndex + 1);
                    stack.push(sIndex + 1);
                } else {
                    stack.push(sIndex + 1);
                }
            }
        }
    
        return count;
    }
}
