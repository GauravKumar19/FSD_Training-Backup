
class Employee{

    empcode:number;//Type Annotation
    empName:String;

    constructor(Code:number, Name:String){ //Type Annotation

        this.empcode = Code;
        this.empName = Name;
    }
   
        
     display():void {
        
        console.log("Name = "+this.empName);
        console.log("Code = "+this.empcode);
    }

    //Arrow Function In class
     display1 = () => console.log("Employee Code: "+this.empcode+"\n Employee Name"+this.empName);

    hello():String{
        return "Hello From Function"
    }
}

let emp = new Employee(100,"James");//Create object of a classs
emp.display();
let b:String =  emp.hello();
console.log(b);

let emp1 = new Employee(7,"Sky Fall");
emp1.display1();//Invokes Arrow Function