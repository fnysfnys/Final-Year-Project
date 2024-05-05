function getMaxRepetitions(s1, n1, s2, n2) {
   let s1Array = s1.split('');
   let s2Array = s2.split('');
   let commonChars = s1Array.filter(char => s2Array.includes(char));
   return commonChars.length;
}
