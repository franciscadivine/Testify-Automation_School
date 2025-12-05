//Create a length converter function
function lengthConverter(value, fromWhichUnit, toUnit ){
  // Convert everything to meters first
  let meters;

  switch (fromWhichUnit) {
    case "m":
      meters = value;
      break;
    case "km":
      meters = value * 1000;
      break;
    case "cm":
      meters = value / 100;
      break;
    case "mm":
      meters = value / 1000;
      break;
    default:
      return "Invalid source unit";
  }
   // Convert meters to target unit
  switch (toUnit) {
    case "m":
      return meters;
    case "km":
      return meters / 1000;
    case "cm":
      return meters * 100;
    case "mm":
      return meters * 1000;
    default:
      return "Invalid target unit";
  }
}


console.log(lengthConverter(2, 'km', 'm'))

