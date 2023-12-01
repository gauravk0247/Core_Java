package javacollection.javalist;

import java.util.ArrayList;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList food = new ArrayList();
		food.add(new Swiggy(101, "Biryani"));
		food.add(new Zomato(202, "Panipuri"));
		food.add(new StreetFood(303, "Mutton Thali"));
		for(Object o:food) {
			if(o instanceof Swiggy) {
				Swiggy s=(Swiggy)o;
				System.out.println(s.swiggyId+" "+s.swiggyItem);
			}
			else if(o instanceof Zomato) {
				Zomato z = (Zomato)o;
				System.out.println(z.zomatoId+" "+z.zomatoItem);
			}
			else if(o instanceof StreetFood) {
				StreetFood sf = (StreetFood)o;
				System.out.println(sf.foodId+" "+sf.foodItem);
			}
		}
	}

}
