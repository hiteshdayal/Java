import java.util.Scanner;

public class Ascending {
	int arr[], Size;
	Scanner scan;
	public Ascending() {
		scan = new Scanner(System.in);
		System.out.println("Enter Size Of Array");
		Size = scan.nextInt();
		arr = new int[Size];
	}
	void Input()
	{
		for(int i=0;i<Size;i++)
		{
			System.out.println("Enter "+i+" Element");
			arr[i] = scan.nextInt();
		}
	}
	void Asc()
	{
		for(int i=0;i<Size;i++)
		{
			for(int j=i;j<Size;j++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	void display()
	{
		for(int N:arr)
		{
			System.out.print(N+" ");
		}
	}
	
	public static void main(String[] args) {
		Ascending obj = new Ascending();
		obj.Input();
		obj.Asc();
		obj.display();
		

	}

}
