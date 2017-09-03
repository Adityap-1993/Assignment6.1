package assignment6_1;  //package declaration
import java.util.*;       //importing scanner 

public class Assignment6_1 {       //class definition 

	public static void main(String[] args) {      //main starts here 
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);        
		
		int[] arr= new int[10];              //declaring array of size 10
		
		
		System.out.println("Enter the array elements:");
		for(int i=0;i<=9;i++)                      //taking array elements
		{
			arr[i]=sc.nextInt();		
		}
		
		System.out.println(" ");
		System.out.println("The Even numbers in array are :");    //printing even numbers from array
		
		
		for(int i=0;i<=9;i++)
		{
			if(arr[i]%2==0)
				System.out.println(arr[i] +  " ");
		}
		

	}

}//class ends
