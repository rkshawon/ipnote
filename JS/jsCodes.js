//polyfill

Array.prototype.shawonFilter = function (fn) {
  const filteredArray = [];
  for (let i of this) {
    if (fn(i)) {
      filteredArray.push(i);
    }
  }
  return filteredArray;
};

const arr = [2, 4, 5, 6, 8].customFilter((item) => item > 3);
console.log(arr);

//class and interitence
class Person {
  constructor(name, age) {
    (this.name = name), (this.age = age);
  }
  getName() {
    console.log("Name is " + this.name + " Age is " + this.age);
  }
}

class Man extends Person {
  constructor(name, age, address) {
    super(name, age);
    this.address = address;
  }
  getName() {
    console.log(
      "Name is " +
        this.name +
        " Age is " +
        this.age +
        " and is address " +
        this.address
    );
  }
}

const man = new Man("Jhon", 55, "basail");
man.getName();

//functional inheritance
const Person = function (name) {
  this.name = name;
  this.getName = function () {
    return "tu";
  };
};

Person.prototype.getAge = function () {
  return 50;
};

const per = new Person("chiura");
console.log(per.getAge());
console.log(per.getName());

const Employee = function (name, salary) {
  Person.call(this, name);
  this.salary = salary;
};

Employee.prototype = Person.prototype; // this line must be here

Employee.prototype.getExperience = function () {
  return 20;
};
//Employee.prototype = Person.prototype; doing here will remove previous method. only method of Person will remain. getExperience will be removed.
const epm = new Employee("Clark", 20000);
console.log(epm.getExperience());
console.log(epm.getAge()); //won't work unless line 67. line 67 has to be in top after fn Constructor
console.log(epm.getName());
console.log(epm);

//Getter and Setter in Object literal
const person = {
  name: "jhon",
  get getName() {
    return this.name;
  },
  set setName(val) {
    this.name = val;
  },
};

person.setName = "Micky";

console.log(person.getName);
//  why getter and setter when we can change name directly?
//  we can modify before returning or setting the value
//  get getName() {
//   return "Mr "+this.name;
// },

//Object.create()
const person = {
  getName() {
    return this.name;
  },
  init(name) {
    this.name = name;
  },
};

const mark = Object.create(person);
person.name = "Mark";
console.log(mark.getName());

const jimmy = Object.create(person, { name: { value: "Jummy" } });
console.log(jimmy.getName());

const shan = Object.create(person);
shan.init("Shan");
console.log(shan.getName());

//for OBject.create inheritence use this:
link: "https://www.youtube.com/watch?v=F-dd2FYnYzg&list=PL1BztTYDF-QOvKYBBYdjzHISCeaYCAEfH&index=11";
