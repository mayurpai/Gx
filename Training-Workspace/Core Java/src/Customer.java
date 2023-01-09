public class Customer {

  public static void payBill() {
    System.out.println("Customer Pays The Bill");
  }

  public void giveBill() {
    System.out.println("Vendor Gives The Bill");
  }

  public static void main(String[] args) {
    payBill();
    Customer c = new Customer();
    c.giveBill();
  }
}
