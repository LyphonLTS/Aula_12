import java.util.Arrays;

import Controller.TravelPackageFacade;
import Controller.User;

class Main {
  public static void main(String[] args) {
    User comprador = new User("João Silva", "123.456.789-00");
    User acompanhante1 = new User("Maria Silva", "987.654.321-00");

    TravelPackageFacade facade = new TravelPackageFacade();
    facade.buyPackage(comprador, Arrays.asList(acompanhante1), 1, "A", "1a Classe",
        "Presidencial", "Luxo", "Pix");
  }
}