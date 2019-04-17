package java09_abstract.interfaceEx;

interface InterA{
	public void getA();
	public void getC();
}

interface InterB{
	public void getB();
	public void getC();
}

interface InterC extends InterA,InterB{
	public void getD();
}

class Child1 implements InterC{
	
	@Override
	public void getA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getC() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getB() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getD() {
		// TODO Auto-generated method stub
		
	}
	
}


public class InterfaceEx_02 {
	public static void main(String[] args) {
		Child1 c = new Child1();
		
		c.getA();
		c.getB();
		c.getC();
		c.getD();
	}
}






























