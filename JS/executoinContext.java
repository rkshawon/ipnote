V8 Engine?
link: "https://www.youtube.com/watch?v=q3Wsoa7wfDg&t=5s"



const Execution_Context ?
*When the JavaScript engine scans a script file,
it makes an environment called the Execution Context that handles the entire transformation and execution of the code.
During the context runtime, the parser parses the source code and allocates memory for the variables and functions.

Execution_Context is created in two two phase : Creation Phase and Code execution phase

In Creation Phase javascript allocates memory for all variables and functions.

Creation Phase:
During the creation phase, the JavaScript engine sets up the environment for executing the code before it starts running the code line by line.

The JavaScript engine scans the code for variable declarations (var, let, and const) and function declarations (function statements).
For variables declared with var, memory space is allocated for them and initialized with the value undefined.
Variables declared with let and const are also allocated memory space but are not initialized (they remain in the "temporal dead zone" ).
Function declarations are entirely hoisted, meaning they are allocated memory space and can be called before their actual declaration in the code.

Execution Phase:
Once the creation phase is completed, the JavaScript engine enters the execution phase.
During the execution phase, the code is executed line by line, and variables and functions are assigned their actual values.
Function calls are executed, and their own execution contexts are created and pushed onto the call stack

*It has two part Memory component and code component
*Memeory component is known as variable environment and code is known as Thread of execution.
*Memory components stores variable and function reference as key value pairs.
*Code components executes all the codes one line at a time.

for execution context explanation-
referece: https://www.youtube.com/watch?v=ZvbzSrg0afE

const Global Space?
*Anything that is not inside a function is call Global Space . 

const V8 Engine?
*V8 is responsible for executing JavaScript code. V8 takes that code and convert it into machine code so that the
 CPU can understand and execute. Other than that it perfoms other important task like Performance Optimization,
 Memory Management, Multithreading, Concurrency and Security.

const Lexical environment?
A Lexical environment in JavaScript is an internal data structure that keeps track of variables,
values, and their scope within a specific part of code.