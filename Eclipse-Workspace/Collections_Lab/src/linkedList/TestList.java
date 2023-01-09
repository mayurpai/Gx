package linkedList;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListDemo demo = new LinkedListDemo();
		demo.createList1();
		demo.createList2();
		boolean flag = demo.checkEquality();
		
		if(flag)
		{
			System.out.println("list 1...");
			demo.displayList(flag);
		}
		else
		{
			demo.mergeList();
			System.out.println("resultlist..");
			demo.displayList(flag);
		}

	}

}
