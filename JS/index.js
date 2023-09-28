const promises = [
  new Promise((resolve) => setTimeout(resolve, 200, "Ben Solo")),
  new Promise((_, reject) => setTimeout(reject, 100, "Darth Vader")),
];
Promise.any(promises)
  .then((characters) => console.log(characters))
  .catch((characters) => console.error(characters));
