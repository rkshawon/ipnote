link: "https://www.mygreatlearning.com/blog/javascript-interview-questions/"
link: "https://www.guru99.com/javascript-interview-questions-answers.html"

job application line: "https://bluethrone.io/careers"

const JavaScript?
*JavaScript is a high-level, dynamically-typed programming language that is used for web development,
and its enables developers to create interactive and dynamic content on websites.
it is a synchonous in nature and single Threaded programming language that


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
    *Compiler: A compiler translates code from a high-level programming language (like Python, JavaScript or Go)
        into machine code before the program runs.
    *Interpreter: An interpreter translates code written in a high-level programming language into machine
        code line-by-line as the code runs.
    *Just-in-time compilation (JIT): In JIT the intermediate representation is compiled to native machine code at runtime.

*The first JavaScript engines were simple interpreters, but all modern engines use (JIT) compilation for performance reasons.

JIT STEP>>>>>>>>>>>>>>>>>
Interpretation: Initially, code is executed by an interpreter, which reads and executes the code line by line.

Profiling: The JIT compiler monitors the execution of the interpreted code and collects information about which
 parts of the code are frequently executed (hot paths).

Optimization: Based on the profiling data, the JIT compiler identifies hot paths and optimizes them by generating optimized
 machine code tailored to the specific hardware and execution environment.

Compilation: The optimized machine code is generated for the hot paths identified during profiling. 
This machine code is much faster than the original interpreted code.

Caching: The generated machine code is cached so that it can be reused for subsequent executions of the 
same hot paths without the need for re-optimization.

Execution: When the optimized machine code is needed, it is executed directly, bypassing the interpreter,
 resulting in significant performance improvements.


*A compiler takes in the entire program and requires a lot of time to analyze the source code.
    Whereas the interpreter takes a single line of code and very little time to analyze it.
*Compiled code runs faster, while interpreted code runs slower.
*A compiler displays all errors after compilation. If your code has mistakes, it will not compile.
    But the interpreter displays errors of each line one by one.
*Interpretation does not replace compilation completely.
*Compilers can contain interpreters for optimization reasons like faster performance and smaller memory footprint.

*In the case of an interpreter, it directly converts the source code into machine code or bytecode as it executes
    the code line by line or statement by statement.This process is typically done in real-time,
    without producing a separate compiled executable.

Dynamic Compilation: Instead of compiling the entire program ahead of time,
JIT compiler translates the program into machine code on-the-fly, just before execution.
    This dynamic compilation happens at runtime.


let value = null;
let def = 0;
const res = value || def;
console.log(res);

const || vs && vs ??(nullish coalescing operator)
(||)If both true || returns first value. but if both side is false then || return last one.if either is false then true one is returned.
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
    *A Package manager is a tool developers use to automate finding, downloading, installing, configuring, upgrading
     and removing a systems packages.
    *NPM (Node Package Manager) and Yarn (Yet Another Resource Negotiator) are two popularly used Package managers.
    *A Package registry is a database (storage) for thousands of packages.

const Module ?
Module is a file that contains code to perform a specific task . A Module may contain variables, functions, classes etc.
Ref link: "https://www.programiz.com/javascript/modules"

const scripting language?
    *A scripting language is a type of programming language that is interpreted and executed at runtime.
    It is often used for automating tasks, controlling software applications, and enabling interactions between different software components.


const Lib vs FrameWork 

**Library:**
- Think of a library as a toolbox. Its a collection of tools (functions, classes, or modules) that you can use when needed.
- You have control over your projects architecture and flow. You decide when to use the tools from the library.
- Libraries are like a set of specialized functions that you call to perform specific tasks. You pick and choose
the tools you need for your project, and you use them in the way you see fit.

**Framework:**
- Imagine a framework as the blueprint for building a house. Its a pre-defined structure and set of rules that guide how your
project should be organized and built.
- With a framework, you follow the established structure and conventions. The framework calls your code, and you provide
the specific implementations within the frameworks constraints.
- Frameworks provide a complete architecture for your project, dictating how different components should interact and
how the project should be organized. You build your application within the frameworks framework.


**Libraries:**

**Pros:**

1. **Flexibility:** Libraries provide flexibility because you can choose which specific functions or components to use.
Youre in control of how and when you use them.

2. **Lightweight:** Libraries tend to be smaller and more lightweight because they focus on specific, isolated functionalities.
This can lead to faster load times and less overhead.

3. **Specialized:** Libraries are often highly specialized, optimized for specific tasks, which can lead to better
 performance and efficiency in those areas.

4. **Minimal Learning Curve:** Since you only use the specific parts of a library that you need, the learning
 curve is generally lower compared to frameworks.

5. **No Dictated Structure:** Libraries dont impose a particular project structure or flow. You have the 
freedom to design your project architecture as you see fit.

**Cons:**

1. **Lack of Guidance:** Libraries provide no overarching structure or guidelines, 
which can be a disadvantage for beginners or projects that require consistency.

2. **More Work:** Using libraries often requires more effort in terms of 
organizing and integrating them into your project, as the burden of creating the overall structure falls on you.

3. **Possibility of Incompatibility:** Mixing multiple libraries in a project may lead to compatibility issues or conflicts.

**Frameworks:**

**Pros:**

1. **Consistency:** Frameworks enforce a consistent project structure and coding conventions, 
which can improve project organization and maintainability.

2. **Rapid Development:** Frameworks often include pre-built components and functionality, 
allowing for faster development as you dont need to reinvent the wheel.

3. **Inversion of Control:** Frameworks handle much of the programs flow and management, reducing 
the need for you to manage low-level details.

4. **Community and Ecosystem:** Popular frameworks have large communities, offering support, 
documentation, and third-party extensions that can speed up development.

5. **Testing and Debugging:** Frameworks often come with built-in tools for testing and debugging, making these processes easier.

**Cons:**

1. **Learning Curve:** Frameworks can have a steep learning curve, especially for newcomers, 
due to their prescribed structure and conventions.

2. **Less Flexibility:** The predefined structure and conventions of a framework can limit your 
flexibility to design the project exactly as you envision it.

3. **Overhead:** Frameworks may introduce some overhead due to their comprehensive nature, 
potentially affecting performance and load times.

4. **Complexity:** Complex frameworks can be overkill for small projects or tasks where simplicity is desired.

In summary, libraries offer flexibility and allow you to pick and choose components but require more work in structuring your project. 
Frameworks provide structure, consistency, and can accelerate development but may have a steeper learning curve and offer less flexibility in design.
 The choice between libraries and frameworks should be based on your projects specific requirements and your teams familiarity with the technology.
 
*****For large application framwork and small application library.


