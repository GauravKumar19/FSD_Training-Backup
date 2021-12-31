/*
    A module is a way to create a group of related variables, functions, classes, and interfaces, etc.
    It executes in the local scope, not in the global scope.
    In other words, the variables, functions, classes, and interfaces declared in a module cannot be accessible outside the module directly.
    We can create a module by using the export keyword and can use in other modules by using the import keyword.
*/

export let age : number = 25;

let company : String ="COFORGE";

export class Addition{//Creating a Module

    a:number;
    b:number;

    constructor(x:number,y:number){

        this.a  = x;
        this.b = y;
    }

    sum(){
        console.log("The Sum of A and B :"+(this.a+this.b));
    }
}