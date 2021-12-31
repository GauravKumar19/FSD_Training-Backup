//named function
function display() {
    console.log("Hello TypeScript!");
    }

    // function with return type
    function Sum(x: number, y: number) : number {
    return x + y;
    }
    
    //anonymous function
    let greeting = function() {
    console.log("Hello TypeScript Anonymous function!");
    };
    /*
ES6 version of TypeScript provides an arrow function which is the shorthand syntax for defining the anonymous function, i.e., for function expressions.
It omits the function keyword. We can call it fat arrow (because -> is a thin arrow and => is a "fat" arrow).
It is also called a Lambda function. The arrow function has lexical scoping of "this" keyword.
*/
    
    //Arrow function With Parameter
    let sum =( a: number, b:number):number=>{return a+b;}

    //Arrow function Without Parameter
    let p =()=>console.log("Hello From Arrow Function");

    display();
    var s = Sum(2,3);
    console.log("The addition of 2 nos is :"+s);
    greeting();

    console.log("Addition Of two Number Using Arrow function"+sum(40,30));
    
    p();//Arrow function Without Parameter Calling