package sample_exmaple;

public class SplitTheString {

	public static void main(String[] args) 
	{
	String split="Java,phyton,selenium";
	String[] print=split.split(",");
	for(int i=0;i<print.length;i++)
	{
		System.out.println(print[i]);
	}
	

	}

}
