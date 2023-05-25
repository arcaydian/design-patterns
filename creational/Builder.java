class BuilderPattern {
  public static void main(String[] args) {
    Car car = new CarBuilder().setType("Sedan").build();
  }
}

interface Car {
  Car setType();
  Car setSeater();
}

class CarBuilder implements Car {
  String type = "";
  int seats = 0;
  
  Car car = new CarBuilder();
  
  @Override
  Car setType(String type) {
    if(type.equals("Sedan")) {
      this.setSeater(5);
    }
    else {
      this.setSeater(7);
    }
    this.type = type;
    return this;
  }
  
  @Override
  Car setSeater(int seats) {
    this.seats = seats;
    return this;
  }
  
  Car build() {
    return this;
  }
}
