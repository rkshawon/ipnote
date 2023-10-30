//ignore name of functions
//file 1
const add_ = (a, b) => {
  return a + b;
};
//
module.exports = add;

module.exports = (a, b) => {
  return a + b;
};

//file 2
const addition = require("./file2");

//file 1
const adds = (a, b) => {
  return a + b;
};
const sub_ = (a, b) => {
  return a + b;
};
module.exports = { add: adds, sub: sub };
//or
module.exports.adds = (a, b) => {
  return a + b;
};
module.exports.sub = (a, b) => {
  return a + b;
};
//also possible but not recommended as exports = something like exports = {add, sub}
// will loss previous reference of modules.exports. exports referse to modules.exports
//we can add like exports.add but not reassign.
exports.adds = (a, b) => {
  return a + b;
};
exports.sub = (a, b) => {
  return a + b;
};

//file 2
const math = require("./file2");
//use
math.adds();
math.sub();

const { adds, sub } = require("./file2");

// Export a default value
module.exports = "This is the default export";

const add = (a, b) => {
  return a + b;
};

const sub = (a, b) => {
  return a - b;
};

module.exports = add; // Export 'add' function as the default export

// Export 'sub' function as a named export
module.exports.sub = sub;

const addFunction = require("./yourModule"); // Replace 'yourModule' with the actual module path

console.log(addFunction(5, 3)); // Output: 8

const subFunction = addFunction.sub;
console.log(subFunction(5, 3)); // Output: 2

// for ESmodule refer this - https://www.youtube.com/watch?v=g98XlFOiXz0&list=PLC3y8-rFHvwh8shCMHFA5kWxD9PaPwxaY&index=16
// if it is named export , import name must be same
// if it is default export , import name can be anything
// its export in es6 not exports
