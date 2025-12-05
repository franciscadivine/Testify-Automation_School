//function that filter negative number
   function filterNegativeNumber(number){
  return number.filter(value => value >= 0)
  }
  const numbers = [9, -5, 15, -8, 0, 7, -3, 12];

const result = filterNegativeNumber(numbers);
console.log(result);



