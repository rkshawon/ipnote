Set:
    A collection of unique values with no duplicates.
    Maintains insertion order.
    Does not have key-value pairs.
Map:
    A collection of key-value pairs.
    Keys can be of any data type, including objects and functions.
    Maintains the order of key insertion.
    Does not have duplicates.
WeakSet:
    A collection of objects only.
    Objects in a WeakSet can be garbage collected if no longer referenced elsewhere.
    Does not have size or iteration methods like forEach.
WeakMap:
    A collection of key-value pairs where keys are objects only.
    Keys in a WeakMap can be garbage collected if no longer referenced elsewhere.
    Lacks size and iteration methods.

const Objects.values()

    const person = {
        firstName: 'John',
        lastName: 'Doe',
        age: 25
    };

    const profile = Object.values(person);

    console.log(profile);
    Code language: JavaScript (javascript)
    Output:

   Output: [ 'John', 'Doe', 25 ]
   Technically, if you use the for...in loop with the Object.hasOwnProperty() method, you will get the same set of values as the Object.values().
   
const Object.is()
   link: 'https://www.javascripttutorial.net/es6/javascript-object-is/'