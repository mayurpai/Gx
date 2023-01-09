package Assignment2;

public class Testclass {

	public static void main(String[] args) {
		LinkedListDemo demo=new LinkedListDemo();
		demo.createList1();
		demo.createList2();
		boolean flag = demo.checkList();
		
		if(flag)
		{
			System.out.println("List1 and list 2");
			demo.displaylist(flag);
		
		}
		else {
			demo.mergelist();
			System.out.println("resultant list");
			demo.displaylist(flag);
		}

	}

}
