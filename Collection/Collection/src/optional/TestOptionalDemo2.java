package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TestOptionalDemo2 {
	static List<String> list = new ArrayList<String>();
	static {
		list.add("Laptop");
		list.add("Monile");
		list.add("Watch");
		list.add(null);
		list.add("NoteBook");
	}
	public static void main(String[] args) {
		Optional<String> opt = null;
		for(int i=0;i<list.size();i++) {
			opt = Optional.ofNullable(list.get(i));
//			System.out.println(opt);
//			System.out.println(opt.isPresent());
			if(opt.isPresent()) {
				String value = opt.get();
				System.out.println(value);
			}
			else {
				String msg = opt.orElse("CYBER SUCCESS");
				System.out.println(msg);
			}
		}
	}
}