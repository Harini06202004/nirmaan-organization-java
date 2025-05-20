package day20;

public class Calculator implements ICalculator{

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Addition = " + (a +b));
		
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Subtraction = " + (a-b));
	}

	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Multiplication = " +(a*b));
		
	}

	@Override
	public void div(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Division = " +(a/b));
		
	}
	
	
}
