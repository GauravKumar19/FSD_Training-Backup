//named function
function display() {
    console.log("Hello TypeScript!");
}
// function with return type
function Sum(x, y) {
    return x + y;
}
//anonymous function
var greeting = function () {
    console.log("Hello TypeScript Anonymous function!");
};
/*
ES6 version of TypeScript provides an arrow function which is the shorthand syntax for defining the anonymous function, i.e., for function expressions.
It omits the function keyword. We can call it fat arrow (because -> is a thin arrow and => is a "fat" arrow).
It is also called a Lambda function. The arrow function has lexical scoping of "this" keyword.
*/
//Arrow function With Parameter
var sum = function (a, b) { return a + b; };
//Arrow function Without Parameter
var p = function () { return console.log("Hello From Arrow Function"); };
display();
var s = Sum(2, 3);
console.log("The addition of 2 nos is :" + s);
greeting();
console.log("Addition Of two Number Using Arrow function" + sum(40, 30));
p(); //Arrow function Without Parameter Calling
