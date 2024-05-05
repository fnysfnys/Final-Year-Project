     function buildTree(inorder, postorder) {
         const indexMap = new Map();
         inorder.forEach((val, index) => indexMap.set(val, index));
         const build = (left, right) => {
             if (left > right) return null;
             const rootVal = postorder.pop();
             const root = new TreeNode(rootVal);
             const rootIndex = indexMap.get(rootVal);
             root.right = build(rootIndex + 1, right);
             root.left = build(left, rootIndex - 1);
             return root;
         };
         return build(0, inorder.length - 1);
     }
     