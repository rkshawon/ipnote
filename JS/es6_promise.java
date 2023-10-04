const event?
    when an HTML element experiences a change in its state due to an activity performed by a user or
    the browser is known as event.


const Event Delegation?
    Event Delegation is a pattern to handle events efficiently. Instead of adding an event listener to each and every similar element,
    we can add an event listener to a parent element and call an event on a particular target using the .target property of the event object.
    https://www.scaler.com/topics/event-delegation-in-javascript/
const Event Propagation?
    Event propagation is a mechanism that defines how events propagate or travel through the DOM tree
    https://www.tutorialrepublic.com/javascript-tutorial/javascript-event-propagation.php

Let’s see an example with and without event delegation

const customUI = document.createElement('ul');

for (var i = 1; i <= 10; i++) {
    const newElement = document.createElement('li');
    newElement.textContent = "This is line " + i;
    newElement.addEventListener('click', () => {
        console.log('Responding')
    })
    customUI.appendChild(newElement);
}
The above code will associate the function with every <li> element that is shown in the below image. We are creating an <ul> element, attaching too many <li> elements, and attaching an event listener with a responding function to each paragraph as we create it.

const Debouncing and Throttling?
    *Debouncing is a technique that ensures a function is not executed until a certain amount of time has passed
    since the last time the function was invoked. 
    *Debouncing is like waiting for a user to finish typing before performing a search.
    if the user types quickly, it will delay the search until they pause.

    *Throttling is a technique that limits the rate at which a function is executed
    by allowing it to run at most once within a specified time interval.
    *Throttling is like accepting a maximum of one request every 5 seconds,
    regardless of how many times a button is clicked.

const Promise?
    A Promise is a special object which is used to handle asynchronous operations in JavaScript.

int link: "https://www.programiz.com/javascript/callback"

const JavaScript Promise Versus Callback?
    The syntax is user-friendly and easy to read.
    Error handling is easier to manage.

const Promise Method()?
int link:"https://medium.com/weekly-webtips/javascript-promises-promise-all-vs-promise-allsettled-vs-promise-race-vs-promise-any-d42b8e272bf8"

const Trailling comma ?
    *Trailing commas in JavaScript refer to the practice of adding a comma after the last item in an array or object literal,
    as well as after the last parameter in a function declaration or call. 
    *Trailing commas can be beneficial in code maintenance
    *Started from ES5(2015)
    Example with function:
    function greet(name, age, ) {}
    not Valid : function nam(,) {} // on empty paranthesis

const Exponential operator?
    * It is represented by the double asterisk (**) symbol. it is used to find the power of any number.
    Example:const result = 2 ** 3 ** 2; // Equivalent to 2 ** (3 ** 2) = 2^9 = 512
    Another way is Math.pow(2,3) and 2<<2(n-1, means 3-1= 2)
     *Started from ES7(2016)

     
const Optional chaining?
    *The optional chaining operator (?.) allows you to access nested properties or calling methods on objects without
    explicitly checking if each reference in the chain is null or undefined.
    *If one of the references in the chain is null or undefined, the optional chaining operator will short circuit and return undefined.
    *It simplifies the process of accessing when the intermediate properties might be undefined or null
    *Started from ES11(2020)