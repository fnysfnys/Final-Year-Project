function getMaxRepetitions(s1, n1, s2, n2) {
   let counter = 0;
   for (let i = 0; i < s1.length; i++) {
       let char = s1[i];
       let matches = s2.match(new RegExp(char, 'g'));
       if (matches !== null) {
           counter += matches.length;
       }
   }
   return counter;
}
