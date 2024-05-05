     function buildTree(inorder, postorder) {
         const stack = [];
         let root = null;
         for (let i = postorder.length - 1; i >= 0; i--) {
             let curr = new TreeNode(postorder[i]);
             if (!root) {
                 root = curr;
             } else {
                 if (stack[stack.length - 1].val === inorder[inorderIndex]) {
                     let parent = stack.pop();
                     while (stack.length > 0 && stack[stack.length - 1].val === inorder[inorderIndex]) {
                         parent = stack.pop();
                         inorderIndex--;
                     }
                     parent.left = curr;
                 } else {
                     stack[stack.length - 1].right = curr;
                 }
             }
             stack.push(curr);
         }
         return root;
     }
     