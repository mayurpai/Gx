public class TestMain {
	public static void main(String argsp[]) {
		Account a1 = new Account();
		
		System.out.println("Performing Account Transactions using AccManager1...");
		AccManager1 mgr1 = new AccManager1();
		mgr1.fillAccountData(a1);
		mgr1.displayAccountData(a1);
		
		System.out.println("Performing Account Transactions using AccManager2...");
		AccManager2 mgr2 = new AccManager2();
		mgr2.fillAccountData(a1);
		mgr2.displayAccountData(a1);
	}
}
