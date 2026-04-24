import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap <Integer, String> h = new HashMap<> ();
		System.out.println(h);
		h.put(100, "abcd");
		System.out.println(h);
		h.put(101, null);
		System.out.println(h);
		h.put(102, "xyz");
		h.put(103, "hi");
		h.put(104, null);
		System.out.println(h);
		String s = h.get(103);
		System.out.println(s);
	}

}
