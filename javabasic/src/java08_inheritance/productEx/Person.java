package java08_inheritance.productEx;

import java07_class.manager.Student;
import java08_inheritance.product.Product;

public class Person {
	private String name;
	private int money;
	private int count=0;
	private Product[] prod = new Product[3];
	
	public Person(String name, int money) {
		this.name=name;
		this.money=money;
		for(int i = 0; i < this.prod.length; i++) {
			prod[i] = new Product(name, money);
		}
	}
	
	public void buy(Product pro) {
		String model=pro.getModel();
		int money = pro.getPrice();
		this.money -= pro.getPrice();
		
		System.out.println(name+"님이 "+money+"원을 지불하고 "+model+"구매함");
		System.out.println("[잔액]"+this.money+"원");
		
		
		System.out.println();
		System.out.println();
	
	}
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	
}
