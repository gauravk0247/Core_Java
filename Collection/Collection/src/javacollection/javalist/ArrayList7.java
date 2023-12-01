package javacollection.javalist;

import java.util.ArrayList;

public class ArrayList7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<BookMyShow> bms = new ArrayList<BookMyShow>();
		bms.add(new BookMyShow (101, "Animal"));
		bms.add(new BookMyShow(202, "Sambahadur"));
		bms.add(new BookMyShow(303, "Salaar"));
		for(BookMyShow bm:bms) {
			System.out.println(bm.ticketId+" "+bm.movieName);
		}
	}

}
