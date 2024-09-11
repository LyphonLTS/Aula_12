package Controller;

import java.util.List;

public class TravelPackageFacade {
  private AirTicketSystem airTicket;
  private HotelSystem hotel;
  private CarSystem car;
  private PaymentSystem payment;

  public TravelPackageFacade() {
    this.airTicket = new AirTicketSystem();
    this.hotel = new HotelSystem();
    this.car = new CarSystem();
    this.payment = new PaymentSystem();
  }

  public void buyPackage(User buyer, List<User> persons,
      int row, String seat, String seatClass,
      String roomType, String carType,
      String typePayment) {
    double precoPassagem = airTicket.reserveTicket(row, seat, seatClass);
    double precoHotel = hotel.reserveRoom(roomType, persons.size() + 1);
    double precoCarro = car.rentCar(carType);

    double totalPrice = precoPassagem + precoHotel + precoCarro;
    double finalPrice = payment.processPayment(totalPrice, typePayment);

    printPurchase(buyer, persons, row, seat, roomType, carType, typePayment, totalPrice,
        finalPrice);
  }

  private void printPurchase(User buyer, List<User> persons, int row, String seat,
      String roomType, String carType, String typePayment,
      double totalPrice, double finalPrice) {
    System.out.println("==== Detalhes da Compra ====");
    System.out.println("Comprador: " + buyer);
    for (User person : persons) {
      System.out.println("Acompanhante: " + person);
    }
    System.out.println("Passagem Aérea: Fileira " + row + " Assento " + seat);
    System.out.println("Quarto de Hotel: " + roomType);
    System.out.println("Carro Alugado: " + carType);
    System.out.println("Forma de Pagamento: " + typePayment);
    System.out.println("Preço total do pacote: R$" + totalPrice);
    System.out.println("Preço final (com descontos/acréscimos): R$" + finalPrice);
  }
}
