package sample_exmaple;

public class Box
{
	double width, height, depth;
	int boxNo;
	Box(double w, double h, double d, int num)
	{
	width = w;
	height = h;
	depth = d;
	boxNo = num;
	}
	Box()
	{
	width = height = depth = 0;
	}
	Box(int num)
	{
	this();
	boxNo = num;
	}
	public static void main(String[] args)
	{
	Box box1 = new Box(10.5,9.6 ,20.567,10);
	System.out.println(box1.width+" "+box1.height+" "+box1.depth);
	
	
	}
}
