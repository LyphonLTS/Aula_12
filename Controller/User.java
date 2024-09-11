package Controller;

public class User {
  private String name;
  private String CPF;

  public User(String name, String CPF) {
    this.name = name;
    this.CPF = CPF;
  }

  public String getCPF() {
    return this.CPF;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Nome: " + this.name + ", CPF: " + this.CPF;
  }
}
