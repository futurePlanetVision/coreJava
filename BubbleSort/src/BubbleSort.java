import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class BubbleSort {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		System.out.println("How many n integer values you want to sort?\n Enter n less than 15 value:");
		
		///arr = Collections.synchronizedList(new ArrayList<Integer>());
		
		
		Scanner scanner=new Scanner(System.in);
		int n= scanner.nextInt();
		//ArrayList<Integer> arr=new ArrayList<>();
		int[] a = new int[n];
		//Iterator<Integer> iterator = arr.iterator();
		if (n < 15){
			for (int i=0;i<n;i++){
				System.out.println("enter "+i+" th number");
				 //arr.add(scanner.nextInt());
				 a[i] =scanner.nextInt();//arr.get(i); //iterator.next().intValue();				//arr.get(i);
				 
			}} 
		else {
				System.out.println("Please enter number less than 15");
				System.exit(0);
			}
		
		//int[] n = (int[])arr.toArray(int[arr.size()]);		
		//int[] arr= {10,2,7,9,5,100,8,4,3,113,}; //initialize primitive array
		//BubbleSort bubbleSort= new BubbleSort();
		System.out.println("Sorted by Bubble Sort! as \n");
	
		bblSort(a);
		}

	/*public static int[] acceptValues(){
		
		Scanner scanner=new Scanner(System.in);
		int n= scanner.nextInt();
		for (int k=0; k<n;k++){
			int[] arr={scanner.nextInt()};
			
		
		}

	}*/
	public static void bblSort( int[] arr){
		int n=arr.length;// determine the size of your array
			int temp;
			for (int j=n;j>=0;j--){// 
				for(int i=0;i<=n-2;i++){
					if (arr[i]> arr[i+1]){
						temp=arr[i];
						arr[i]=arr[i+1];
						arr[i+1]=temp;
					}
				}
				//System.out.println(n);
			}
			
			
			
			for (int m=0;m<n;m++){
			System.out.print(arr[m]+"  ");
			}
			
		
			
		}
}
