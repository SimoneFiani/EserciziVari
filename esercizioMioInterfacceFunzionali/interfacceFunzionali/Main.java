package interfacceFunzionali;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(2);
		list.add(3);
		list.add(4);

		Collections.sort(list, (o1, o2) -> o1 - o2);

		System.out.println(list);

	}

}
