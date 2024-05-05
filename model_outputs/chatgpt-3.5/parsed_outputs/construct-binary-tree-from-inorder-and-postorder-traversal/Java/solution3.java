class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int inLen = inorder.length;
        int postLen = postorder.length;
        if (inLen != postLen || inLen == 0) {
            return null;
        }

        Map<Integer, Integer> inorderMap = new HashMap<>();
        for (int i = 0; i < inLen; i++) {
            inorderMap.put(inorder[i], i);
        }

        TreeNode root = new TreeNode(postorder[postLen - 1]);
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        for (int i = postLen - 2; i >= 0; i--) {
            int postVal = postorder[i];
            TreeNode node = stack.peek();
            if (inorderMap.get(postVal) > inorderMap.get(node.val)) {
                node.right = new TreeNode(postVal);
                stack.push(node.right);
            } else {
                while (!stack.isEmpty() && inorderMap.get(postVal) < inorderMap.get(stack.peek().val)) {
                    node = stack.pop();
                }
                node.left = new TreeNode(postVal);
                stack.push(node.left);
            }
        }

        return root;
    }
}