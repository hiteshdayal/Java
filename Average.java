import java.util.Scanner;

public class Average {
	int TotalNo, sum=0, length;
	double Average;
	int arr[];
	Scanner scan;
	
	public Average() {
		scan = new Scanner(System.in);
		System.out.println("Enter Total No. You Want To No.");
		TotalNo = scan.nextInt();
		arr = new int[TotalNo];
	}
	void input()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter "+(i+1)+" No.");
			arr[i] = scan.nextInt();
		}
	}
	void avg()
	{
		length = arr.length;
		for(int N: arr)
		{
			sum += N;
		}
		Average = (double)sum/length;
	}
	void display() 
	{
		/*for(int No:arr)
		{
			System.out.println(No+" ");
		}*/
		System.out.println("Average  = "+Average);
	}
	
	public static void main(String[] args) {
		Average obj = new Average();
		obj.input();
		obj.avg();
		obj.display();
	}

}
