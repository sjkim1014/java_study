package java08_inheritance.productEx;

import java07_class.manager.Student;
import java08_inheritance.product.Product;

public class Person_2 {
	private String name;
	private int money;
	private int count=0;
	private Product[] prod = new Product[3];
	
	public Person_2(String name, int money) {
		this.name=name;
		this.money=money;
		for(int i = 0; i < this.prod.length; i++) {
			prod[i] = new Product(null, 0);
		}
	}
	
	public void buy(Product pro) {
		if(count>=3) {
			System.out.println("에러 : 상품이 꽉찼습니다");
			count=0;
			return;
		}
		
		String model=pro.getModel();
		int money = pro.getPrice();
		this.money -= pro.getPrice();		
		
		System.out.println(name+"님이 "+money+"원을 지불하고 "+model+"구매함");
		System.out.println("[잔액]"+this.money+"원");
		
		countInfo(prod[count], model,money);		
		
		for(int num=0; num<prod.length; num++) {
			countPrint(prod[num]);
	    }		
		count++;
		
		System.out.println();
		System.out.println();
	
	}
	
	public void countInfo(Product pro ,String model,int money) {
		pro.setModel(model);	
		pro.setPrice(money);
	}
	public void countPrint(Product pro) {		
		System.out.print(pro.getModel()+" "+pro.getPrice()+" ");
	}
	
	
	public void sell() {
		
		if(count>=3) {
			System.out.println("에러 : 상품이 다팔렸따");
			return;
		}
		
		
		String model=prod[count].getModel();
		int money = prod[count].getPrice();
		this.money += prod[count].getPrice();		
		
		System.out.println(name+"님이 "+money+"원을 받고 "+model+"판매함");
		System.out.println("[잔액]"+this.money+"원");
		
		System.out.println();
		count++;
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
