"use strict";
/*
    A module is a way to create a group of related variables, functions, classes, and interfaces, etc.
    It executes in the local scope, not in the global scope.
    In other words, the variables, functions, classes, and interfaces declared in a module cannot be accessible outside the module directly.
    We can create a module by using the export keyword and can use in other modules by using the import keyword.
*/
exports.__esModule = true;
exports.Addition = exports.age = void 0;
exports.age = 25;
var company = "COFORGE";
var Addition = /** @class */ (function () {
    function Addition(x, y) {
        this.a = x;
        this.b = y;
    }
    Addition.prototype.sum = function () {
        console.log("The Sum of A and B :" + (this.a + this.b));
    };
    return Addition;
}());
exports.Addition = Addition;
