Local Storage:

Definition: Local Storage is a web storage technology that allows web applications to store data locally within a 
web browser. It provides a simple key-value store for persisting data on the client-side.

Usage: Local Storage is typically used to store data that needs to persist across browser sessions, 
such as user settings, authentication tokens, or cached data.

Storage Limit: Local Storage provides around 5-10 MB of storage per domain, which can vary among different browsers.

Data Type: Local Storage can store data in the form of strings. If you want to store more complex data types, 
you need to serialize them to strings (e.g., using JSON).

Methods: Local Storage provides the following methods for working with data:

localStorage.setItem(key, value): Adds or updates a key-value pair in local storage.
localStorage.getItem(key): Retrieves the value associated with a key.
localStorage.removeItem(key): Removes a key-value pair.
localStorage.clear(): Clears all data stored in local storage.
localStorage.key(index): Returns the key at a given index.
JSON (JavaScript Object Notation):

Definition: JSON is a lightweight data interchange format. It is used to represent structured 
data as text and is easy for humans to read and write. In JavaScript, JSON is used for data serialization and interchange.

Usage: JSON is used to exchange data between a server and a client, to store configuration 
settings, and to represent complex data structures.

Syntax: JSON data is represented as key-value pairs, similar to JavaScript objects. 
It supports data types like strings, numbers, arrays, and objects.

Methods: In JavaScript, you can use the following methods to work with JSON:


//code 
Using JSON with Local Storage:

To store complex data structures in Local Storage, you can convert them to JSON strings using JSON.stringify
 before saving them, and then parse them back into JavaScript objects using JSON.parse 
 when retrieving the data. Heres an example:

JSON.stringify(obj): Converts a JavaScript object into a JSON string.
JSON.parse(json): Parses a JSON string and returns a JavaScript object.

// Storing data in Local Storage as a JSON string
const data = { name: "John", age: 30 };
localStorage.setItem("userData", JSON.stringify(data));

// Retrieving and parsing data from Local Storage
const storedData = JSON.parse(localStorage.getItem("userData"));
console.log(storedData.name); // Output: John
