OOPS
Link: "https://www.javatpoint.com/javascript-oops-classes"


const Class?
    *Class are the special type of functions.We can define the class just like function declarations
    and function expressions.
    *The class is executed in strict mode
    *Class declaration is not a part of JavaScript hoisting. So, it is required to declare the 
    class before invoking it.

What is this keyword?
Ans: The ‘this’ keyword is a special keyword that is automatically defined within the scope
of every function and behaves differently depending on how the function is called. 
The value of this is determined dynamically at runtime based on the invocation context
of the function. The ‘this’ keyword in JavaScript refers to the current execution
 context of a function.

 function Pet(name) {
  this.getName = () => {
    this.name = name;
    console.log(this.name);
  };
}
const cat = new Pet("Fluffy");

const { getName } = cat;
getName();

const person = {
  name: "Jack",
  age: 25,
  innerFunc: () => {
    console.log(this);
    console.log(this.age);
  },
};
person.innerFunc();
output: Fluffy
{}
undefined

Yes, you can say that within a constructor function, the behavior of this is consistent
 between arrow functions and normal functions when the constructor is invoked using the
  new keyword. In both cases, this refers to the newly created object.

However, its important to note that the behavior of this differs between arrow functions
 and normal functions outside of the context of a constructor function. In arrow functions,
  this is lexically scoped and does not change its value, while in normal functions,
   this depends on how the function is called and can change its value based on the 
   caller or the context in which its invoked.

const New Keyword?
New keyword in JavaScript is used to create an instance of an object that has a constructor function
while creating an object using Function Ccontructor new keyword does three things .
*First create an empty { } object on function contructor.
*The new object’s internal ‘Prototype’ property (__proto__) is set the same as the prototype of the constructing function.
*It also make sure that the this keyword in Function Ccontructor point to the newly created empty object.
    It binds the property which is declared with ‘this’ keyword to the new object.
*Finaly it returns the object from Function Ccontructor

*About the returned value, there are three situations below. 
If the constructor function returns a non-primitive value (Object, array, etc), the constructor function still returns that value.
Which means the new operator won’t change the returned value.
If the constructor function returns nothing, ‘this’ is return;
If the constructor function returns a primitive value,  it will be ignored, and ‘this’ is returned.

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
 JavaScript engine adds a prototype property inside a function, 
//When we create objects, these objects inherit properties and methods from the constructors prototype via the prototype chain.

Object.prototype sits at the top of the prototype chain and provides basic methods and properties that are
inherited by all objects.

All objects in JavaScript directly or indirectly inherited from Object.prototype. This means that all objects,
whether built-in or custom, have common methods like toString(), valueOf(),


proto (often called "dunder proto" or "magic proto") is a property that exists on all JavaScript objects.
It is a reference to the prototype object of the constructor that was used to create the object.
It is part of the internal mechanism for object inheritance and provides a way to access the prototype of an object.

Functions prototype property can be accessed using <function-name>.prototype. However,
an object (instance) does not expose prototype property, instead you can access it using __proto__.

console.log(Student.prototype); // object
console.log(studObj.prototype); // undefined
console.log(studObj.__proto__); // object

Prototype property is basically an object (also known as Prototype object),
 where we can attach methods and properties in a prototype object, which enables all the other
 objects to inherit these methods and properties.

"JavaScript engine adds a prototype property inside a function":
In JavaScript, every function has a built-in property called prototype. This property is automatically created for every function,
and its used to establish the prototype chain.

"Prototype property is basically an object (also known as Prototype object)":
The prototype property of a function is indeed an object. Its often referred to as the "prototype object" or "prototype" for short.

"We can attach methods and properties in a prototype object":
You can add methods and properties to the prototype object of a function. These methods and properties become shared among all
instances (objects) created from that functions constructor. This allows you to define common behavior that multiple objects should inherit.

"Enables all the other objects to inherit these methods and properties":
When you create objects using a constructor function (using the new keyword), those objects inherit the methods and properties from the constructor
functions prototype. This inheritance forms the prototype chain, which is a mechanism for object inheritance in JavaScript.
This means that objects created from the same constructor function share a common set of methods and properties via their prototype chain.

// proto should generally be used for informational or debugging purposes, and you should avoid modifying it directly; instead,
// you should use the "prototype" property of constructor functions or classes to define the inheritance structure for objects.

Prototype Chain in JavaScript is a hierarchical structure of object prototypes, enabling
inheritance of properties and methods among objects

const Contructor Function?
    * Contructor function is a function in javascript which is used to create several objects.
    * We can instantiate object and implement inheritance.
    * It can be normal function or function expression. 
    * 
Call Apply Bind?
The behaviour of the apply() method in Javascript changes between strict and non-strict mode.
 The strict mode can be enabled in Chrome by adding 'use strict;' on the top.

ECMAScript 5 and later let scripts opt in to a new strict mode, which alters the semantics
 of JavaScript in several ways to improve its resiliency and which make it easier to understand 
 whats going on when there are problems. MDN Web Docs

In strict mode, if null or undefined is passed as the first argument to the apply() method,
 it will use the value as it is.
In non-strict mode (default), if null or undefined is passed as the first argument
 to the apply() method, it will be replaced with the global object.