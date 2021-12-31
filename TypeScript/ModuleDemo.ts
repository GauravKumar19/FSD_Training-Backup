//Accessing the module in another file by using the import keyword

import { Addition } from "./Addition"

//Import Entire module
import * as abc from "./Addition"

let addObj = new Addition(20,60);

addObj.sum();
console.log(abc.age);
//console.log(abc.company);