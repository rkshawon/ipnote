const jsonfile = require("jsonfile");
const moment = require("moment");
const simplegit = require("simple-git");

const FILE_PATH = "./data.json";

const DATE = moment().subtract(5, "days").format();

const data = {
  date: DATE,
};

jsonfile.writeFile(FILE_PATH, data, () => {
  simplegit().add(FILE_PATH).commit(DATE, { "--date": Date }).push();
});
