package sample_exmaple;

public class SplitString {

	public static void main(String[] args) {
		String s="java,python,ruby";
		
		String[] splited=s.split(",");
		for(int i=0;i<splited.length;i++)
		{
			System.out.println(splited[i]);
		}
		String s1 = "Interview Questions for Java ";
		String newString = s1.replaceAll("\\s","");
		System.out.println("Old String: " + s1);
		System.out.println("New String: " + newString);
		
		//concat
		String s2="And Selenium Q&A";
		String s3=s1.concat(s2);
		System.out.println(s3);
		
		//replace the string
		s3=s1.replace("Java", "Python");
		System.out.println(s3);

	}

}
