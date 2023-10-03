link: "https://www.mygreatlearning.com/blog/javascript-interview-questions/"
link: "https://www.guru99.com/javascript-interview-questions-answers.html"

job application line: "https://bluethrone.io/careers"

const JavaScript?
*JavaScript is a programming language that is used for web development.
it is a high-level, dynamically-typed synchonous single Threaded language that
enables web developers to create interactive and dynamic content on websites.

**JavaScript is an object-based language. Everything is an object in JavaScript.
**JavaScript is template based not class. Here we dont create classes to get the object. But we can direct create objects.

*JavaScript is known for its flexibility, as it can be used for a wide range of tasks beyond web development,
including server-side scripting (Node.js), desktop application development, and even
IoT (Internet of Things) programming. It plays a crucial role in modern web development,
making web pages more engaging and user-friendly.

*Fact, var a = b = 3;
is actually shorthand for:
b = 3;
var a = b;


const Compiler vs Interpreter?
    *Compiler: A compiler translates code from a high-level programming language (like Python, JavaScript or Go) into machine code before the program runs.
    *Interpreter: An interpreter translates code written in a high-level programming language into machine code line-by-line as the code runs.
    *Just-in-time compilation (JIT): In JIT the intermediate representation is compiled to native machine code at runtime.

*The first JavaScript engines were simple interpreters, but all modern engines use just-in-time (JIT) compilation for performance reasons.

*A compiler takes in the entire program and requires a lot of time to analyze the source code. Whereas the interpreter takes a single line of code and very little time to analyze it.
*Compiled code runs faster, while interpreted code runs slower.
*A compiler displays all errors after compilation. If your code has mistakes, it will not compile. But the interpreter displays errors of each line one by one.
*Interpretation does not replace compilation completely.
*Compilers can contain interpreters for optimization reasons like faster performance and smaller memory footprint.

*In the case of an interpreter, it directly converts the source code into machine code or bytecode as it executes the code line by line or statement by statement.
This process is typically done in real-time, without producing a separate compiled executable.

Dynamic Compilation: Instead of compiling the entire program ahead of time,
JIT compiler translates the program into machine code on-the-fly, just before execution. This dynamic compilation happens at runtime.


let value = null;
let def = 0;
const res = value || def;
console.log(res);

const || vs && vs ??(nullish coalescing operator)
(||)If both true || returns first value. but if both side is false then || return last one and && returns first one.if either is false then true one is returned.
(&&)If both true && returns last value. but if both side is false then && return first value.if either is false then false one is returned.
(??)If both true ?? returns first value. but if both side is false then ?? return last value.if either is false then true one is returned.

*??(nullish coalescing operator) is a logical operator which is similar to ||(OR) but with little difference.
*In case of ?? true and false indicates only null and undefined . other falsy value like 0,"" is not considered true.

const String padding?
String padding in JavaScript refers to adding characters to the beginning or end of a string to make it a specific length.

const originalString = '42';
const paddedString = originalString.padEnd(5, '*');
console.log(paddedString); // Outputs: '42***'
//ref collection file for more details


const  Issues with dynamically typed languages?
    *Type Errors at Runtime: : In dynamically typed languages, type checking is performed at runtime rather than at compile-time.
        trying to perform an operation on incompatible data types, may only be discovered when the program is executed.
        This can lead to unexpected crashes or behavior.
    *Reduced Performance: Runtime environment needs to determine types dynamically. This can result in slower execution speed.
    *Readability and Maintainability: Code written in dynamically typed languages can be less readable and maintainable.
    *Debugging Complexity: Debugging can be more challenging in dynamically typed languages because type-related issues may only surface during runtime.

const NPM?
    *A Package manager is a tool developers use to automate finding, downloading, installing, configuring, upgrading, and removing a systems packages.
    *NPM (Node Package Manager) and Yarn (Yet Another Resource Negotiator) are two popularly used Package managers.
    *A Package registry is a database (storage) for thousands of packages.

const Module ?
Module is a file that contains code to perform a specific task . A Module may contain variables, functions, classes etc.
Ref link: "https://www.programiz.com/javascript/modules"

const Number?
Ref link: "https://www.programiz.com/javascript/numbers"

const Math? 
Ref Link: "https://www.programiz.com/javascript/library/math/random"

const Array Method?
Ref link: "https://www.programiz.com/javascript/library/array/length"

const String Method?
Ref link: "https://www.programiz.com/javascript/library/string/length"

