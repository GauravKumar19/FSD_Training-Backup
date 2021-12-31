let num1: number = 1;

function letDeclaration() {

    let num2: number = 2; 
    
    if (num2 > num1) {
        
        var num3: number = 3; //Declare Global variable
        //let num3: number = 3; Scope level variable - Local variable
        num3++;
    } 
    while (num1 < num2) {

        var num4: number = 4;
        num1++;
    }
    console.log(num1);
    console.log(num2);
    console.log(num3);
    console.log(num4);

    const num : number = 300;//Declaring a constant

    console.log(num);
} 
    letDeclaration();