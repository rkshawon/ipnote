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

Employee.prototype = Person.prototype;

Employee.prototype.getExperience = function () {
  return 20;
};
const epm = new Employee("Clark", 20000);
console.log(epm.getExperience());
console.log(epm.getAge()); //wrong won't work
console.log(epm.getName());
console.log(epm);
