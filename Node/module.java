const common js?
Common js is starndard that states how a modules should be structure and shared. 

const module?
A modules is an encapsulated and reusable chunk of code that has its own context .
in node each file is treaded as separate module

Three type of moduels-
Local- what we create,
build it - nodejs provides us,
third party- written by other developer which we can use.

const exports module- 
*module.exports name of function of variable or class
*each loaded modules in nodejs is wrapped with an iffe that provides private scoping of code 
*iffe allows us to repeat variable or function names without any conflits 

when moduls is wrapped with iffe it takes 5 params.
(function(exports, require, module, __filename, __dirname){
    const a = 's';
    console.log(a);
})()
__dirname- directory path of current folder
__filename- current file path the file is in
require - imports modules by path


const modules caching ?
moduls is cached no matter how many time it is required.
const first = require("first")
some code 
const second = require("second")
some code again
*here some code again will take first require value . requiring second time is ignored as its is cached
//for better understanding - https://www.youtube.com/watch?v=JQfOtwfDohY&list=PLC3y8-rFHvwh8shCMHFA5kWxD9PaPwxaY&index=13

build in module- path, fs, event, streem, http, 