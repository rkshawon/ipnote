var a = {
  b: 7,
  func: function () {
    this.b--;
  },
};

console.log(a.b);
var User = function () {};

User.prototype.attributes = {
  isAdmin: false,
};

var admin = new User("Sam"),
  guest = new User("Bob");

admin.attributes.isAdmin = true;

console.log(admin.attributes.isAdmin);
console.log(guest.attributes.isAdmin);
