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

 const How V8 Engine works?
 link: "https://www.geeksforgeeks.org/how-v8-compiles-javascript-code/"

    *Parsing Phase: During the parsing phase, the code is broken down into its tokens.
        const sum = 5 + 7.Here const is a token, sum is a token, 5 is a token, ‘+’ is a token, and 7 is a token.
        After the code is broken down into tokens, it is given to the syntax parser which converts the code into an Abstract Syntax Tree (AST).
        It is easier to convert into mahcine code when we have code in Tree data structure thats why parser creates AST.

    *Compilation phase: Compilation is the process of converting human-readable code to machine code.
        V8 engine uses both a compiler and an interpreter and follows Just in Time(JIT) Compilation for improved performance.
        The code is converted into IR(Intermediate Representation) version of the code which id byte code. Reason for doing this is
        to make to Byte code is universal means not hardware dependent so it can run on any device.

        The V8 engine uses the Ignition interpreter, which takes in the Abstract Syntax Tree as the input and gives the byte code as the output,
        which further proceeds to the execution phase. When the code is being interpreted,
        the compiler tries to talk with the interpreter to optimize the code. The V8 engine uses the Turbofan compiler,
        which takes the byte code from the interpreter as
        the input and gives the optimized machine code as the output.

    *Execution Phase: The byte code is executed by using the Memory heap and the Call Stack of the V8 engine’s runtime environment.
        Memory Heap is the place where all the variables and functions are assigned memory. Call Stack is the place where each individual functions,
        when called are pushed to the stack, and popped out after their execution.

    * Inline Cache: Inline Cache is a data structure used to keep track of the addresses of the properties on objects,
        thereby reducing the lookup time. It tracks all the LOAD, STORE, and CALL events within a function, by maintaining a Feedback Vector.
        Feedback Vector is simply an array used to track all the Inline Caches of a particular function.

    *Garbage Collection: The V8 engine is provided with the Orinoco Garbage Collector which internally uses the Mark and Sweep Algorithm
        to free up space from the memory heap.

const Lexical environment?
A Lexical environment in JavaScript is an internal data structure that keeps track of variables,
values, and their scope within a specific part of code.