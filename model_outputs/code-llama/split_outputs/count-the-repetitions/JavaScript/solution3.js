function getMaxRepetitions(s1, n1, s2, n2) {
   let counter = 0;
   for (let i = 0; i < s1.length; i++) {
       let char = s1[i];
       let index = s2.indexOf(char);
       if (index !== -1) {
           let lastIndex = s2.lastIndexOf(char);
           counter += (lastIndex - index) + 1;
       }
   }
   return counter;
}
