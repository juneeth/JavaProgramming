package day5_polymorphism;

public class Call_By_reference_main {

	public static void main(String[] args) {
		Call_By_reference op=new Call_By_reference();
		op.number=100;
		System.out.println("Before executing the method the value of Number"+op.number);
		op.main(op);
		System.out.println("After executing the method the value of Number"+op.number);
	}

}
