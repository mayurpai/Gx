package hashMap;

import java.util.HashMap;
import java.util.HashSet;

public class StringUtility {
	private HashMap<String, Integer> hm = new HashMap<String, Integer>();

	public StringUtility() {
		super();
	}

	public HashMap<String, Integer> getHm() {
		return hm;
	}

	public void setHm(HashMap<String, Integer> hm) {
		this.hm = hm;
	}

	public int uniqueCharacterCount(String s) {
		if (hm.containsKey(s)) {

			return hm.get(s);
		} else {

			HashSet<Character> hs = new HashSet<Character>();
			for (int i = 0; i < s.length(); i++) {
				if (!hs.contains(s.charAt(i))) {
					hs.add(s.charAt(i));
				}
			}

			hm.put(s, hs.size());
			System.out.println(hs);
			System.out.println(hm);
			return hs.size();

		}

	}

}
