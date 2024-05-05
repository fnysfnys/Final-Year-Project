     function buildTree(inorder, postorder) {
         const stack = [];
         let root = new TreeNode(postorder[postorder.length - 1]);
         stack.push(root);
         for (let i = postorder.length - 2; i >= 0; i--) {
             const curr = new TreeNode(postorder[i]);
             if (curr.val !== stack[stack.length - 1].val) {
                 stack[stack.length - 1].right = curr;
             } else {
                 let parent = stack.pop();
                 parent.left = curr;
                 while (stack.length > 0 && stack[stack.length - 1].val === curr.val) {
                     parent = stack.pop();
                 }
             }
             stack.push(curr);
         }
         return root;
     }
     