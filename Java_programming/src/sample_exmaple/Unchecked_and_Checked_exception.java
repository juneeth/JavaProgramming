package sample_exmaple;

public class Unchecked_and_Checked_exception {

	public static void main(String[] args) {
		int a=100;
		try
		{
		int b=a/0; // unchecked exception	
		System.out.println(b);
		}
		catch (Exception e) {
			System.out.println("Input is wrong");
		}
	}

}
