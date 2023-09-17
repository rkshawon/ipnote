Array.prototype.shawonFilter = function (fn) {
  const filteredArray = [];
  for (let i = 0; i < this.length; i++) {
    if (fn(this[i])) {
      filteredArray.push(this[i]);
    }
  }
  return filteredArray;
};
const arr = [2, 4, 5, 6, 8];
console.log(arr.shawonFilter((item) => item > 3));
