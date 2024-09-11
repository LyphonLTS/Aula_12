package Controller;

public class PaymentSystem {
  public double processPayment(double totalPrice, String typePayment) {
    double finalPrice = totalPrice;
    switch (typePayment) {
      case "Pix":
        finalPrice = totalPrice * 0.9;
        break;
      case "Boleto":
        finalPrice = totalPrice * 0.95;
        break;
      case "Débito":
        finalPrice = totalPrice;
        break;
      case "Crédito":
        finalPrice = totalPrice * (1 + 0.0399 * 5); // 6 parcelas, 5 delas com juros
        break;
      default:
        throw new IllegalArgumentException("Forma de pagamento inválida.");
    }
    System.out.println("Pagamento processado via " + typePayment + ". Preço final: R$" + finalPrice);
    return finalPrice;
  }
}
