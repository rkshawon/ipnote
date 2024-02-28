//Given a string, reverse each word of that string
//For manual reverse take new empty variable and add char in there

const str = "This is developer portfolio";
const newStr = str.split("").reverse().join("");
console.log(str, newStr);
