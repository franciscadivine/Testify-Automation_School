
//Return number of vowel in a string
function returnVowel(str){
  let count = 0;
 for (let char of str.toLowerCase()) {

  switch (char){
    case 'a':
     case 'e':
     case 'i':
     case 'o':
    case 'u':
      count++;
   
  }
 }
   return count;
  }
  
  console.log(returnVowel('francisca'))


