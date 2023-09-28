const b = document.querySelector("#id");
const div = document.querySelector("#div");
const frm = document.querySelector("#frm");

frm.addEventListener("click", () => {
  console.log("frm");
});

div.addEventListener("click", () => {
  console.log("div");
});

b.addEventListener("click", () => {
  console.log("button");
});
