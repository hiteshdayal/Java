package src;

import java.util.Scanner;

public class laddersum {

	int arr[][], row, add=0, length, k=0;
	Scanner scan = new Scanner(System.in);
	void input()
	{
		System.out.println("Enter Row Of An Array");
		row = scan.nextInt();
		arr = new int[row][];
		for(int i=0;i<row;i++)
		{
			arr[i] = new int[i+1];
		}
		length = arr.length;
	}
	void inputNo()
	{
		//System.out.println(arr[5][0]);
		for(int i=0;i<arr[row-1].length;i++)
		{
			arr[row-1][i] = scan.nextInt();
		}
	}
	
	void sum1(int arr[][], int i, int j)
	{
		//System.out.println("i="+i);
		if(i-1==j)
		{
			return;
		}
		arr[j-1][i-1] = arr[j][i-1] + arr[j][i];
		sum1(arr, i+1, j);
		
	}
	
	void sum(int arr[][], int i, int j)
	{
		if(j==0)
		{
			return;
		}
		sum1(arr, i, j-1);
		sum(arr, i, j-1);
		
	}
	
	void call()
	{
		sum(arr, 1, length);
	}
	
	void show1(int arr[][], int i, int j)
	{
		if(i-1==j) {
			return;
		}
		System.out.print(arr[j-1][i-1] + " ");
		show1(arr, i+1, j);
	}
	
	void show(int arr[][], int i,int j)
	{
		if(j==0)
		{
			return;
		}
		show1(arr, i, ++k);
		System.out.println();
		show(arr, i, j-1 );
	}
	void displaySum()
	{
		show(arr,1,length);
	}
	
	/*void display()
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}*/
	
	
	public static void main(String[] args) {
		laddersum obj = new laddersum();
		obj.input();
		obj.inputNo();
		obj.call();
		obj.displaySum();
		//obj. display();

	}

}
