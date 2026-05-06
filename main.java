import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int mul = 1;
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        
        for(int i = 0 ; i<n ; i++){
            arr[i]= sc.nextInt();
        }
        
        for(int i = 0; i < n ; i++){
            mul = 1;
            for(int j = 0; j < n ; j++){
                if(i != j){
                    mul = mul * arr[j];
                }
                
            }
            arr1[i] = mul;
        }
        System.out.print(Arrays.toString(arr1));
    }
}




import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		
		String[] words = sentence.split(" ");
		
		System.out.print(Arrays.toString(words));
	}
}



import java.util.*;
public class Main
{
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);

    int age = sc.nextInt();   // takes number
    sc.nextLine();            // consume leftover newline

    String name = sc.nextLine();

    System.out.println(age);
    System.out.println(name);
	   
  	}
}

import java.util.*;
public class Main{
    public static void main(String[] args){
     
       int[]  arr = {6,5,4,3,2,1};
         int n = arr.length;

         for(int i = 0; i < n ; i++){
            for(int j = 0 ;  j < n-1-i ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
         }
         System.out.print(Arrays.toString(arr));

    }
}



public class Main
{
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,5,5} ;
		
		int n = arr.length;
		
		boolean isSort = true;
		
		for(int i = 0 ; i < n -1  ; i++){
		    if(arr[i] != arr[i+1] - 1){
		        isSort = false;
		        break;
		    }
		        
		  
		    
		}
		System.out.print(isSort);
		
	}
}


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		 
		int[] arr = {5,3,2,1,4};
		
		Arrays.sort(arr);
		System.out.print(arr[1]);
	}
}