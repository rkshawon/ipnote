class MyClass {
  #privateField = 10; // Private field

  constructor() {
    this.publicField = 20; // Public field
  }

  #privateMethod() {
    return "Private method";
  }

  publicMethod() {
    return "Public method";
  }

  accessPrivateField() {
    return this.#privateField;
  }

  accessPrivateMethod() {
    return this.#privateMethod();
  }
}

const instance = new MyClass();
console.log(instance.publicField); // Accessible
//   console.log(instance.#privateField); // Error (private)
console.log(instance.publicMethod()); // Accessible
//   console.log(instance.#privateMethod()); // Error (private)
