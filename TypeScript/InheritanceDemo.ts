class Car {

    Color: string;

        constructor(color: string) {
      this.Color = color;
    }
  }
  class Audi extends Car {

     Price: number;

    constructor(color: string, price: number) {

      super(color); // invokes base class constructor
      this.Price = price
    }

    display(): void {
      console.log("Color of Audi car: " + this.Color);
      console.log("Price of Audi car: " + this.Price);

    }
  }
  let obj = new Audi(" Black", 8500000); //invokes constructor
  obj.display();