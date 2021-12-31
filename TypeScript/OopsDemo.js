var Employee = /** @class */ (function () {
    function Employee(Code, Name) {
        var _this = this;
        //Arrow Function In class
        this.display1 = function () { return console.log("Employee Code: " + _this.empcode + "\n Employee Name" + _this.empName); };
        this.empcode = Code;
        this.empName = Name;
    }
    Employee.prototype.display = function () {
        console.log("Name = " + this.empName);
        console.log("Code = " + this.empcode);
    };
    Employee.prototype.hello = function () {
        return "Hello From Function";
    };
    return Employee;
}());
var emp = new Employee(100, "James"); //Create object of a classs
emp.display();
var b = emp.hello();
console.log(b);
var emp1 = new Employee(7, "Sky Fall");
emp1.display1(); //Invokes Arrow Function
