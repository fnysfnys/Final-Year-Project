function getMaxRepetitions(s1, n1, s2, n2) {
   let counter = 0;
   for (let i = 0; i < s1.length; i++) {
       let char = s1[i];
       let placeholder = '*';
       let replaced = s2.replace(new RegExp(char, 'g'), placeholder);
       counter += replaced.length - s2.length;
   }
   return counter;
}
