package java08_inheritance.productEx;

import java08_inheritance.product.Computer;
import java08_inheritance.product.Product;
import java08_inheritance.product.Tv;

public class PersonEx_2 {
	public static void main(String[] args) {
		
		Person_2 p = new Person_2("Alice", 2000);
		System.out.println("------------------------------");
		System.out.println(p.getName()+"´ÔÀÇ ÃÑ ÀÚ»ê : " + p.getMoney() + "¿ø");
		System.out.println("------------------------------");
		
		
		Product prod1 = new Tv("LG", 300);
		Product prod2 = new Computer("i5", 500);
		Product prod3 = new Tv("SAMSUNG", 350);
		Product prod4 = new Computer("i3", 400);
		
		p.buy(prod1);
		p.buy(prod2);
		p.buy(prod3);
		p.buy(prod4);
		
		p.sell();
		p.sell();
		p.sell();
		p.sell();

	}
}
