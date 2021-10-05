

import java.util.function.Predicate;

public class predicatenumber {

	public static void main(String[] args) {
Predicate<Integer> greater = i -> (i > 18);
System.out.println(greater.test(19));
System.out.println(greater.test(10));
	}

}
