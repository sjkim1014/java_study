package java08_inheritance.productEx;

import java08_inheritance.product.Computer;
import java08_inheritance.product.Product;
import java08_inheritance.product.Tv;

public class PersonEx {
	public static void main(String[] args) {
		
		Person p = new Person("Alice", 1000);
		
		Product prod1 = new Tv("LG", 300);
		Product prod2 = new Computer("i5", 500);
		
		p.buy(prod1);
		p.buy(prod2);


	}
}