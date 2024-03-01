V8 Engine?
link: "https://www.youtube.com/watch?v=q3Wsoa7wfDg&t=5s"



const Execution_Context ?
*When the JavaScript engine scans a script file,
it makes an environment called the Execution Context that handles the entire transformation and execution of the code.
// During the context runtime, the parser parses the source code and allocates memory for the variables and functions.

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

    *Memory Heap is the place where all the variables and functions are assigned memory. Call Stack is the place where each individual functions,
        when called are pushed to the stack, and popped out after their execution.

    * Inline Cache: Inline Cache is a data structure used to keep track of the addresses of the properties on objects,
        thereby reducing the lookup time. It tracks all the LOAD, STORE, and CALL events within a function, by maintaining a Feedback Vector.
        Feedback Vector is simply an array used to track all the Inline Caches of a particular function.

    *Garbage Collection: The V8 engine is provided with the Orinoco Garbage Collector which internally uses the Mark and Sweep Algorithm
        to free up space from the memory heap.

const Lexical environment?
A Lexical environment in JavaScript is an internal data structure that keeps track of variables,
values, and their scope within a specific part of code.

const this keyword in constructor function vs constructor method?
Inside the Constructor Function:
When you have this.name = name; inside the constructor function, this refers to the specific instance of the object being created (in this case, person1).
This usage of this is during the initialization phase of the object creation. Its setting up properties that are unique to each instance of the object. 
Here, this is directly involved in setting the properties of the object being constructed.

Inside the Method Defined in the Constructor Function:
When you have this.sayName = function() { console.log(this.name); }; inside the constructor function,
 this within the method refers to the object on which the method is called (in this case, person1).
This usage of this is within a method attached to the object. Here, this is used to access other properties or
 methods of the same object. In this specific example, its used to access the name property of the object to log it.

While both usages of this ultimately refer to the same object (person1), theyre being used in different
  contexts within the constructor function: one for initializing properties (this.name = name;) and the other
   for defining a method that operates on those properties (this.sayName = function() { console.log(this.name); };).

const Hoisting?
Hoisting in JavaScript is a behavior in which a function or a variable can be used before declaration

const Memory Leak?
    A Memory leak can be defined as a piece of memory that is no longer being used or required by an application but
    for some reason is not returned back to the OS.In simple terms it is forgotten data forever waiting to be used.
    link: 'https://medium.com/preezma/memory-leaks-in-javascript-and-how-to-avoid-them-63916a02f68#:~:text=A%20Memory%20leak%20can%20be,forever%20waiting%20to%20be%20used.'

const Garbage collection?
    *Garbage collection in JavaScript is a process that automatically manages memory by reclaiming unused memory
    occupied by objects that are no longer needed in a JavaScript program. JavaScript engines,
    like the one in browsers or Node.js,handle this process to ensure efficient memory usage and prevent memory leaks.
    
    The garbage collection process involves two primary techniques: reference counting and the Mark and Sweep algorithm.
    Reference counting keeps track of how many references an object has; when an objects reference count drops to zero,
    it becomes eligible for removal. The Mark and Sweep algorithm, on the other hand, identifies and collects object
    that are no longer accessible from the root of the application.




JIT the profiler observes code execution to identify hot code paths, 
the baseline compiler quickly generates basic machine code for immediate execution,
 and the optimizing compiler uses profiling data to produce highly optimized machine
  code for the most frequently executed parts of the code. Together, these components 
  work to dynamically improve the performance of JavaScript code at runtime.