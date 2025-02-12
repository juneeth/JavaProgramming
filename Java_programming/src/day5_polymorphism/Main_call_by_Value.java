package day5_polymorphism;

public class Main_call_by_Value {

	public static void main(String[] args) {
		Call_by_value o=new Call_by_value();
		int number=100;
		System.out.println("Before method the value of number is "+number);
		o.main(number);
        System.out.println("After executing the methid the value of number is :"+number);
	}

}
