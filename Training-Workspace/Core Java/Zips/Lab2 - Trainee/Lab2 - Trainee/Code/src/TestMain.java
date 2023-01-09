public class TestMain {
	public static void main(String argsp[]) {
		Account a1 = new Account();
		
		System.out.println("Performing Account Transactions using AccManager...");
		AccManager mgr = new AccManager();
		mgr.fillAccountData(a1);
		mgr.displayAccountData(a1);
	}
}
