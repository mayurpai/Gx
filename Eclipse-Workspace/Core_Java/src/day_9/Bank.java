package day_9;

// Spring Is A Framework Providing Infrastructre Support For Developing Java Applications With Dependency Injection, Inversion Of Control

// Payment Class
// Dangerous Line As Lot Of Memory Is Allocated
// Payment payment = new Payment();
// payment.withdraw();

// Bean: Object That Is Instantiated, Controlled, Managed By The IOC Container (Dependencies Will Be Injected By Spring Whenever Required)
// DI: A Proggramming Design Pattern That Makes Code Loosely Coupled, Meaning That Any Change In One Compoment, Wouldn't Affect The Others
// IOC: Control Will Be Inverted, You Won't Be Responsible For Object Creation And Management, As Spring Framework Will Look After It

class Customer {

  public void payBill() {
    System.out.println("Customer Pays The Bill");
  }
}

public class Bank {

  Customer customer = new Customer();

  // Customer customer;
  // This Won't Work Unless We Allocate The Memory And Will Give NullPointerException

  public void display() {
    customer.payBill();
  }

  public static void main(String[] args) {
    Bank bank = new Bank();
    bank.display();
  }
}
