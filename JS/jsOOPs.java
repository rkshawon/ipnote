const new Keyword?
New keyword does three things while creating an object using function contructor.
*First create and empty { } object on function contructor.
*It also make sure that the this keyword in function contructor point to the newly created empty object.
*Finaly it returns the object from function contructor

Example:
const jhon = new Person();

//roll of new keyword
jhon = {}
new -> jhon
return jhon object