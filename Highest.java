import java.util.Scanner;

public class Highest {

	int arr[],Size, high,low;
	Scanner scan = new Scanner(System.in);
	public Highest() {
		
		System.out.println("Enter Size Of An Array");
		Size = scan.nextInt();
		arr = new int[Size];
	}
	
	void input()
	{
		System.out.println("Enter No's");
		for(int i=0;i<Size;i++)
		{
			arr[i] = scan.nextInt();
		}
	}
	void HighestNo()
	{
		high = arr[0];
		for(int i=0;i<Size;i++)
		{
			if(high<arr[i])
			{
				high = arr[i];
			}
		}
	}
	void LowestNo()
	{
		low = arr[0];
		for(int i=0;i<Size;i++)
		{
			if(low>arr[i])
			{
				low = arr[i];
			}
		}
	}
	
	void display()
	{
		System.out.println("Highest No. = " + high);
		System.out.println("Lowest No. = " + low);
	}
	public static void main(String[] args) {
		
		Highest obj = new Highest();
		obj.input();
		obj.HighestNo();
		obj.LowestNo();
		obj.display();
		

	}

}
