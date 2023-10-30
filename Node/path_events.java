const path  = require("path")

console.log(__filename)//file path with name in string
output - E:\RK\ipnote\js 
console.log(__dirname)//folder path in string
output- E:\RK\ipnote\js\index.js

console.log(path.join('folder1', "folder2", 'filename.js'))
output - folder1\folder2\filename.js
console.log(path.join('folder1', "//folder2", 'filename.js')) // doing // no effect
output - folder1\folder2\filename.js
console.log(path.join("folder1", "folder2", "../filename.js"));
output - folder1\filename.js


resolve:
console.log(path.resolve("folder1", "folder2", "filename.js")); // joins wit root
console.log(path.resolve("/folder1", "folder2", "filename.js")); // because of / does not join 
console.log(path.resolve("folder1", "//folder2", "filename.js")); //because of // in f2 skip root and prev folder
console.log(path.resolve("folder1", "//folder2", "../filename.js"));//because of ../ it skip f2 and because of // it skiped f1
console.log(path.resolve(__dirname, "filename.js")); // directory name is attached with filename.
output:
E:\RK\ipnote\js\folder1\folder2\filename.js
E:\folder1\folder2\filename.js
E:\folder2\filename.js
E:\filename.js
E:\RK\ipnote\js\filename.js

refer - https://www.youtube.com/watch?v=p995SdRXw_E&list=PLC3y8-rFHvwh8shCMHFA5kWxD9PaPwxaY&index=19

const Synchronous callbacks?
Synchronous callbacks are functions that are executed immediately.
Example: data.map/filter/sort
const Asyncronous?
Callbacks are used to delay the execution of function until a particuler time or event has occured 
Example: file read, fetch or network 


const event = require("events");

const e = new event();

e.on("test", (p1, p2) => {
  console.log("hello", p1, p2);
});
e.on("test", (p1) => {
  console.log("hello", p1);
});
e.emit("test", "param1", "param2"); // emit triger the code
