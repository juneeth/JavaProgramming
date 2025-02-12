package day3;

public class Two_dimensional_Array {

	public static void main(String[] args) {
		int a[][]= {{100,200}
		            ,{300,400}
		            ,{500,600}
		            ,{700,800}
		            };
		System.out.println("Sample : "+a[3][1]);
		System.out.println(a.length);
		
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				System.out.print(a[r][c]+"  ");
			}
			System.out.println();
		
		
		}
		System.out.println("The length of the row is "+ a.length);
		System.out.println("The length of the column is "+ a[0].length);
	}

}
