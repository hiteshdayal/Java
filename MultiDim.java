import java.util.Scanner;

public class MultiDim {

	Scanner scan; 
	int arr[][] = new int[3][3];
	int sum[][] = new int[3][3];
	MultiDim()
	{
		scan = new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j] = scan.nextInt();
			}
		}
		
	}
	/*MultiDim(MultiDim obj1)
	{
		
	}*/
	void sum(MultiDim obj1)
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
					sum[i][j] = this.arr[i][j]+obj1.arr[i][j];
			}
		}
	}
	void display()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	void showSum()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		MultiDim obj1 = new MultiDim();
		MultiDim obj2 = new MultiDim();
		obj2.sum(obj1);
		obj1.display();
		System.out.println();
		obj2.display();
		System.out.println();
		obj2.showSum();
		
		

	}

}
