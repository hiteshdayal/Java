import java.util.Scanner;

public class Ladder {

	int arr[][], row, col;
	Scanner scan = new Scanner(System.in);
	void ArraySize()
	{
		System.out.println("Enter Rows : ");
		row = scan.nextInt();
		arr = new int[row][];
		
		for(int i=0;i<row;i++)
		{
			arr[i] = new int[i+1];
		}
	}
	void input()
	{
		System.out.println("Enter Elements");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j] = scan.nextInt();
			}
		}
	}
	
	void display()
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Ladder obj =new Ladder();
		obj.ArraySize();
		obj.input();
		obj.display();
	}

}
