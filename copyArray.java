import java.util.Scanner;

public class copyArray {

	int arr[], copyArr[],  Size;
	Scanner scan = new Scanner(System.in);
	public copyArray() {
		System.out.println("Enter Size Of Array");
		Size = scan.nextInt();
		arr = new int[Size];
		copyArr = new int[Size];
	}
	
	void input()
	{
		for(int i=0;i<Size;i++)
		{
			System.out.println("Enter "+ (i+1) +" Element");
			arr[i] = scan.nextInt();
		}
	}
	
	void copy()
	{
		for(int i=0;i<Size;i++)
		{
			copyArr[i] = arr[i];
		}
	}
	void display()
	{
		for(int i=0;i<Size;i++)
		{
			System.out.print(copyArr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		copyArray obj = new copyArray();
		obj.input();
		obj.copy();
		obj.display();

	}

}
