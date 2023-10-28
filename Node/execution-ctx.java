	console.log(global);
	console.log(this);
	1. In Node this return {} and global returns global object.
	2. In Browser this and windows returns same object.


//Node
console.log(this); -> {}
console.log(global); -> {Global Object}
inside function -> Global
Object -> function -> current object
inside Object -> function -> function - > Global

//Browser
console.log(this); -> {window Object}
console.log(global); -> {window Object}
inside function -> Global
Object -> function -> current object
inside Object -> function -> function - > window

"use strict" // Node
console.log(this); -> {}
console.log(global); -> {Global Object}
inside function -> undefined
Object -> function -> current object
inside Object -> function -> function - > undefined

"use strict" // Browser
console.log(this); -> {window Object}
console.log(global); -> {window Object}
inside function -> undefined
Object -> function -> current object
inside Object -> function -> function - > undefined

Scope: It is the area where a function or variable can be found.

Scope Chain: 
A scope chain refers to the unique spaces that exist from the scope where a variable got called to the global scope.

What is Lexical Scope in JavaScript?
Lexical scope is the definition area of an expression.
In other words, an items lexical scope is the place in which the item got created.
Note:
• Another name for lexical scope is static scope.
• The place an item got invoked (or called) is not necessarily the items lexical scope. Instead, an items definition space is its lexical scope.

From <https://www.freecodecamp.org/news/javascript-lexical-scope-tutorial/> 



var varname;
console.log(varname);
varname = 10;
console.log(varname);
var varname;
console.log(varname);
var varname = 51;
console.log(varname);
	• Redeclaration with same name does not count. Line 5 does is ghost;

Temporal Dead Zone explained
The state where variables are un-reachable. They are in scope, but they arent declared.
The let and const variables exist in the TDZ from the start of their enclosing scope until they are declared.

From <https://www.freecodecamp.org/news/what-is-the-temporal-dead-zone/> 

Shadowing: Now, when a variable is declared in a certain scope having the same name defined on its outer scope and when we call the variable from the inner scope, the value assigned to the variable in the inner scope is the value that will be stored in the variable in the memory space. This is known as Shadowing or Variable Shadowing. In JavaScript, the introduction of let and const in ECMAScript 6 along with block scoping allows variable shadowing.

From <https://www.geeksforgeeks.org/variable-shadowing-in-javascript/> 


Object Literal Syntax Extensions in ES6

From <https://www.javascripttutorial.net/es6/object-literal-extensions/> 

JavaScript Arrow Function
From <https://www.programiz.com/javascript/arrow-function> 


*for of vs for in : for in iterate array, string and obj gives key or index where for of iterate array and string not object and gives value;

*String. length gives the total length including white space.

A function definition (also called a function declaration, or function statement) 

function myFunction(p1, p2) {
  return p1 * p2;
}
Function invocation/call
myFunction(1,2);

function expression.

const square = function (number) {
  return number * number;
};

console.log(square(4)); // 16

Practice link

https://coderdost.github.io/
https://github.com/umeshgmrl/Learn-MERN-stack/blob/master/javascr