let msg : string ='Hello World';

let age : number = 20;

var isMarry : boolean = false;

/* The TypeScript code we write is in the global scope by default. 
If we have multiple files in a project, the variables, functions, etc. 
written in one file are accessible in all the other files.*/

var greet : String ="TypeScript Global Scope variable";

console.log(msg);

/* We can specify the type using :Type after the name of the variable, parameter or property.
This is called Type Annotation */

/* Type annotations are used to enforce type checking.
It is not mandatory in TypeScript to use type annotations.
However, type annotations help the compiler in checking types and helps avoid errors dealing with data types.
It is also a good way of writing code for easier readability and maintenance by future developers working on your code.*/