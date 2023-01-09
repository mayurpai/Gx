package linkedList;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

	 	private LinkedList<Integer> l1;
	 	private LinkedList<Integer> l2;
	 	private LinkedList<Integer> resultList;
		
	 	public LinkedListDemo() {
			super();
		}
	 	
	 	
	 	
	 	public LinkedListDemo(LinkedList<Integer> l1, LinkedList<Integer> l2, LinkedList<Integer> resultList) {
			super();
			this.l1 = l1;
			this.l2 = l2;
			this.resultList = resultList;
		}



		public void createList1()
	 	{
	 		l1= new LinkedList<Integer>();
	 		l1.add(10);
	 		l1.add(20);
	 		l1.add(30);
	 		l1.add(40);
	 		
	 		
	 	}
	 	
	 	public void createList2()
	 	{
	 		l2 = new LinkedList<Integer>();
	 		l2.add(10);
	 		l2.add(12);
	 		l2.add(40);
	 		l2.add(50);
	 		l2.add(60);

	 		
	 		
	 	}


		public LinkedList<Integer> getL1() {
			return l1;
		}


		public void setL1(LinkedList<Integer> l1) {
			this.l1 = l1;
		}


		public LinkedList<Integer> getL2() {
			return l2;
		}


		public void setL2(LinkedList<Integer> l2) {
			this.l2 = l2;
		}


		public LinkedList<Integer> getResultList() {
			return resultList;
		}


		public void setResultList(LinkedList<Integer> resultList) {
			this.resultList = resultList;
		}
	 	
		
		public boolean checkEquality()
		{
			if(l1.equals(l2))
			{
				return true;
				
			}
			else return false;
			
		}
		
		
		public void mergeList()
		{
			if(this.checkEquality()==false)
			{
				this.resultList= new  LinkedList<Integer>();
				HashSet<Integer> hs = new HashSet<Integer>();
				for(int d : this.l1)
				{
					if(!hs.contains(d))
					{
						hs.add(d);
						resultList.add(d);
					}
					
				}
				for(int d : this.l2)
				{
					if(!hs.contains(d))
					{
						hs.add(d);
						resultList.add(d);
					}
					
				}
				System.out.println(hs);
				System.out.println(resultList);
			}
			
		}
		
		
		public void displayList(boolean flag)
		{
			if(flag==true)
			{
				ListIterator<Integer> iter = this.l1.listIterator();
				while(iter.hasNext())
				{
					System.out.print(iter.next()+" ");
				}
			
			}
			
			else
			{
				ListIterator<Integer> iter = this.resultList.listIterator();
				while(iter.hasNext())
				{
					System.out.print(iter.next()+" ");
				}
			
			}
			
		}
	 	
	 	
	

}
