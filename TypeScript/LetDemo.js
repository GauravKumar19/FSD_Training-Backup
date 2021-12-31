var num1 = 1;
function letDeclaration() {
    var num2 = 2;
    if (num2 > num1) {
        var num3 = 3; //Declare Global variable
        //let num3: number = 3; Scope level variable - Local variable
        num3++;
    }
    while (num1 < num2) {
        var num4 = 4;
        num1++;
    }
    console.log(num1);
    console.log(num2);
    console.log(num3);
    console.log(num4);
    var num = 300; //Declaring a constant
    console.log(num);
}
letDeclaration();
