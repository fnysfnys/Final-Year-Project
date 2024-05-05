function lengthOfLIS(nums) {
   let graph = new Graph();
   for (let i = 0; i < nums.length; i++) {
       graph.addVertex(nums[i]);
   }
   let maxLength = 0;
   for (let i = 0; i < graph.size(); i++) {
       let currentLength = 1;
       for (let j = i + 1; j < graph.size(); j++) {
           if (graph.get(j) > graph.get(i)) {
               currentLength++;
           }
       }
       maxLength = Math.max(maxLength, currentLength);
   }
   return maxLength;
}
