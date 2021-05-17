import java.util.Scanner;

public class ReverseArray {
	int Size;
	int arr[];
	Scanner scan;
	public ReverseArray() {
		scan = new Scanner(System.in);
		System.out.println("Enter Size Of An Array");
		Size = scan.nextInt();
		arr = new int[Size];
	}
	void input()
	{
		for(int i=0;i<Size;i++)
		{
			System.out.println("Enter "+(i+1)+" Element");
			arr[i] = scan.nextInt();
		}
	}
	void Rev() 
	{
		System.out.println("Reversed Array : \n");
		for(int i=Size-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
	 
	
	public static void main(String[] args) {
		
		ReverseArray obj = new ReverseArray();
		obj.input();
		obj.Rev();

	}

}
