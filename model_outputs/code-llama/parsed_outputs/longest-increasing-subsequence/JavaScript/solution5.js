function lengthOfLIS(nums) {
   let tree = new Tree();
   for (let i = 0; i < nums.length; i++) {
       tree.insert(nums[i]);
   }
   let maxLength = 0;
   for (let i = 0; i < tree.size(); i++) {
       let currentLength = 1;
       for (let j = i + 1; j < tree.size(); j++) {
           if (tree.get(j) > tree.get(i)) {
               currentLength++;
           }
       }
       maxLength = Math.max(maxLength, currentLength);
   }
   return maxLength;
}
