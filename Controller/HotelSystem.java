package Controller;

public class HotelSystem {
  private double price = 200;
  private double executiveMultiplier = 1.5;
  private double firstClassmultiplier = 3.0;

  public double reserveRoom(String roomType, int personNumber) {
    double pricePerPerson = 0;
    if (roomType.equals("Simples")) {
      pricePerPerson = price;
    } else if (roomType.equals("Executivo")) {
      pricePerPerson = price * executiveMultiplier;
    } else if (roomType.equals("Presidencial")) {
      pricePerPerson = price * executiveMultiplier * firstClassmultiplier;
    }
    double totalPrice = pricePerPerson * personNumber;
    System.out.println("Quarto reservado: " + roomType + " para " + personNumber + " pessoas.");
    return totalPrice;
  }
}
