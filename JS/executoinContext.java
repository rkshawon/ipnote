const Execution_Context ?
*When the JavaScript engine scans a script file,
it makes an environment called the Execution Context that handles the entire transformation and execution of the code.
During the context runtime, the parser parses the source code and allocates memory for the variables and functions.

Execution_Context is created in two two phase : Creation Phase and Code execution phase

*It has two part Memory and code
*Memeory is known as variable environment and code is known as Thread of execution.
*Memory components stores variable and function reference as key value pairs.
*Code components executes all the codes one line at a time.

for execution context explanation-
referece: https://www.youtube.com/watch?v=ZvbzSrg0afE

const Global Space?
*Anything that is not inside a function is call Global Space . 

const Lexical scope?
*This process or the ability of the function to be able to access variables of the parent is called lexical scope.
In other words, the inner child function is always lexically bound to its parent and can always access its variables.
Lexical scope in this case is the scope where the target variables were created not called.
You can call a variable in one place but declare it in another place, for example, the parent function.

