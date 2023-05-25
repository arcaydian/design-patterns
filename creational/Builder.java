class BuilderPattern {
  public static void main(String[] args) {
    Car car = new CarBuilder().setType("Sedan").setSeater(5).build();
  }
}

interface Car {
  String setType();
  int setSeater();
}

class CarBuilder implements Car {
  String type = "";
  int seats = 0;
  
  Car car = new CarBuilder();
  
  @Override
  String setType(String type) {
    this.type = type;
  }
  
  @Override
  int setSeater(int seats) {
    this.seats = seat;
  }
  
  Car build() {
    return this;
  }
}
