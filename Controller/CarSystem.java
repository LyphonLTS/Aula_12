package Controller;

public class CarSystem {
  private double price = 150;
  private double executiveMultiplier = 2.0;
  private double firstClassmultiplier = 2.0;

  public double rentCar(String carType) {
    double standarPrice = 0;
    if (carType.equals("Econômico")) {
      standarPrice = price;
    } else if (carType.equals("Executivo")) {
      standarPrice = price * executiveMultiplier;
    } else if (carType.equals("Luxo")) {
      standarPrice = price * executiveMultiplier * firstClassmultiplier;
    }
    System.out.println("Carro alugado: " + carType);
    return standarPrice;
  }
}
