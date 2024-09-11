package Controller;

public class AirTicketSystem {
  private double price = 500;
  private double executiveMultiplier = 2.5;
  private double firstClassmultiplier = 1.5;

  public double reserveTicket(int row, String seat, String seatClass) {
    double standardPrice = 0;
    if (seatClass.equals("Econômica")) {
      standardPrice = price;
    } else if (seatClass.equals("Executiva")) {
      standardPrice = price * executiveMultiplier;
    } else if (seatClass.equals("1a Classe")) {
      standardPrice = price * executiveMultiplier * firstClassmultiplier;
    }
    System.out.println("Passagem reservada na classe " + seatClass + " fileira " + row + " poltrona " + seat);
    return standardPrice;
  }
}
