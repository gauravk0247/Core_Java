package optional;

import java.util.Optional;

public class TestOptionalDemo1 {

	public static void main(String[] args) {
		Integer obj1 = 108;
		Integer obj2 = null;
		
		Optional op1 = Optional.empty();
//		System.out.println(op1);
//		Optional<Integer> op2 = Optional.ofNullable(108);
		Optional<Integer> op2 = Optional.ofNullable(obj2);
		System.out.println(op2);
//		Optional<Integer> op3 = Optional.ofNullable(obj1);
		Optional<Integer> op3 = Optional.ofNullable(obj2);
		System.out.println(op3);
		
	}
}