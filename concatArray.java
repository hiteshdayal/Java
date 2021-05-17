import java.util.Scanner;

public class concatArray {
	
	int arr1[], arr2[], arr3[], Size1, Size2, Size3;
	Scanner scan = new Scanner(System.in);
	public concatArray() {
		System.out.println("Enter Size Of 1st An Array");
		Size1 = scan.nextInt();
		System.out.println("Enter Size Of 2nd An Array");
		Size2 = scan.nextInt();
		arr1 = new int[Size1];
		arr2 = new int[Size2];
		arr3 = new int[Size1+Size2];
	}
	void input()
	{
		System.out.println("Enter Element Of 1st Array");
		for(int i=0;i<Size1;i++) 
		{
			arr1[i] = scan.nextInt();
		}
		System.out.println("Enter Element Of 2nd Array");
		for(int i=0;i<Size2;i++) 
		{
			arr2[i] = scan.nextInt();
		}
	}
	
	void concat()
	{
		int k=0;
		for(int i=0;i<Size1+Size2;i++)
			
		{
			if(i<Size1)
			{
				arr3[i] = arr1[i];
			}
			else
			{
				arr3[i] = arr2[k];
				k++;
			}
		}
	}
	
	void display()
	{
		System.out.println("Concatenated Array : ");
		for(int i=0;i<Size1+Size2;i++)
		{
			System.out.print(arr3[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		
		concatArray obj = new concatArray();
		obj.input();
		obj.concat();
		obj.display();

	}

}
