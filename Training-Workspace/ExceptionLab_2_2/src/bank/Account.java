package bank;

//1) Checked Exception
//The classes that directly inherit the Throwable class except RuntimeException and Error 
//are known as checked exceptions.
//For example, IOException, SQLException, etc. Checked exceptions are checked at compile-time.
public class Account {
	public Account() {
		System.out.println("Account class Constructor called");
	}
}
