package hashSet;

import java.util.HashSet;
import java.util.Set;

public class Phone {
	public static void main(String[] args) {
		Set<String> s1 = new HashSet<String>();
		Set<String> s2 = new HashSet<String>();
		s1.add("Apple");
		s1.add("Samsung");
		s1.add("LG");
		s1.add("Nokia");
		s1.add("Micromax");
		
		s2.add("Sony");
		s2.add("Apple");
		s2.add("Nokia");
		s2.add("HTC");
		s2.add("Spice");
		
		Set<String> s_inter=new  HashSet<String>(s1);
		s_inter.retainAll(s2);
		System.out.println("intersection "+s_inter);
		
		Set<String> s_union=new  HashSet<String>(s1);
		s_union.addAll(s2);
		System.out.println("union "+s_union);
		
		Set<String> s_diff_s1=new  HashSet<String>(s1);
		s_diff_s1.removeAll(s2);
		System.out.println("difference "+s_diff_s1);
		
		Set<String> s_diff_s2=new  HashSet<String>(s2);
		s_diff_s2.removeAll(s1);
		System.out.println("difference "+s_diff_s2);
		
	}

}
