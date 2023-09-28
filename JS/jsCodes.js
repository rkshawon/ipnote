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
