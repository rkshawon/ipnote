//Given a string, reverse each word of that string
const str = "This";
let temp = str[1];
str[1] = str[0];
str[0] = temp;
console.log(str);
