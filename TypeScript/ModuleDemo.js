"use strict";
//Accessing the module in another file by using the import keyword
exports.__esModule = true;
var Addition_1 = require("./Addition");
//Import Entire module
var abc = require("./Addition");
var addObj = new Addition_1.Addition(20, 60);
addObj.sum();
console.log(abc.age);
//console.log(abc.company);
