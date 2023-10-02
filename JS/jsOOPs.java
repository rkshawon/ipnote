OOPS
Link: "https://www.javatpoint.com/javascript-oops-classes"


const Class?
    *Class are the special type of functions.We can define the class just like function declarations
    and function expressions.
    *The class is executed in strict mode
    *Class declaration is not a part of JavaScript hoisting. So, it is required to declare the 
    class before invoking it.

const new Keyword?
while creating an object using Function Ccontructor new keyword does three things .
*First create and empty { } object on function contructor.
*It also make sure that the this keyword in Function Ccontructor point to the newly created empty object.
*Finaly it returns the object from Function Ccontructor

Example:
const jhon = new Person();

//roll of new keyword
jhon = {}
new -> jhon
return jhon object

const Prototype?
In JavaScript, prototypes allows an objects to inherit properties and methods from other objects,
forming a chain of inheritance known as the prototype chain.

Prototypes are important because they enable code reuse and allow objects to share common functionality.
They help create a more efficient and memory-conscious way of handling objects and their methods

Every function in JavaScript has a prototype property.
//When we create objects, these objects inherit properties and methods from the constructors prototype via the prototype chain.

Object.prototype sits at the top of the prototype chain and provides basic methods and properties that are
inherited by all objects.

All objects in JavaScript directly or indirectly inherited from Object.prototype. This means that all objects,
whether built-in or custom, have common methods like toString(), valueOf(),


proto (often called "dunder proto" or "magic proto") is a property that exists on all JavaScript objects.
It is a reference to the prototype object of the constructor that was used to create the object.
It is part of the internal mechanism for object inheritance and provides a way to access the prototype of an object.

// proto should generally be used for informational or debugging purposes, and you should avoid modifying it directly; instead,
// you should use the "prototype" property of constructor functions or classes to define the inheritance structure for objects.

Prototype Chain in JavaScript is a hierarchical structure of object prototypes, enabling
inheritance of properties and methods among objects

const Contructor Function?
    * Contructor function is a function in javascript which is used to create several objects.
    * We can instantiate object and implement inheritance.
    * It can be normal function or function expression. 