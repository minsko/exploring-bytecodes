import java.util.List;
import java.util.ArrayList;

public class Java8 {

	public static void main (String args[]) {
		Java8 j8 = new Java8();
		List<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Banana");
		list.add("IBM");
		j8.loop(list);
	}

	public void loop(List<String> vals) {
		vals.forEach(s -> System.out.println(s));
	}

}
