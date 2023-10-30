const event = require("events");

const e = new event();

e.on("test", (p1, p2) => {
  console.log("hello", p1, p2);
});
e.on("test", (p1) => {
  console.log("hello", p1);
});
e.emit("test", "param1", "param2");
