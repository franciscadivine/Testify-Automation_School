//Create a function that reverse an array
function reverseArray(number) {
  let reversed = [];
  
  for (let i = number.length - 1; i >= 0; i--) {
    reversed.push(number[i])
  }

  return reversed;
}

console.log(reverseArray[1,2,3,4,5])

