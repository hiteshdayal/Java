
public class Varargs {
	int sum=0;
	void Arg(int ...x)
	{
		for(int i=0;i<x.length;i++)
		{
			sum += x[i];
		}
	}
	void display()
	{
		System.out.println("sum = "+ sum);
	}
	
	public static void main(String[] args) {
		Varargs obj = new Varargs();
		obj.Arg(2,3,4);
		obj.display();
		obj.Arg(2,3,4,11,56,3,7,43,6,7);
		obj.display();
		

	}

}
