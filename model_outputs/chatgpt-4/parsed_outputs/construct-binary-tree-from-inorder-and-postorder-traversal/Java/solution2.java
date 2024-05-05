import java.util.HashMap;
import java.util.Map;

class Solution {
    int postIndex;
    Map<Integer, Integer> inorderMap;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex = postorder.length - 1;
        inorderMap = new HashMap<>();
        
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        return build(inorder, postorder, 0, inorder.length - 1);
    }
    
    private TreeNode build(int[] inorder, int[] postorder, int inStart, int inEnd) {
        if (inStart > inEnd) return null;

        TreeNode root = new TreeNode(postorder[postIndex--]);
        int inIndex = inorderMap.get(root.val);

        root.right = build(inorder, postorder, inIndex + 1, inEnd);
        root.left = build(inorder, postorder, inStart, inIndex - 1);

        return root;
    }
}