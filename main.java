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

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		 
		int[] arr = {5,3,2,1,4};
		
		int n = arr.length;
         
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < n ; i++){
            if(largest < arr[i]){
                secondlargest = largest;
                largest = arr[i];
                
            }
           else if(secondlargest < arr[i] && largest > arr[i]){
               secondlargest = arr[i];
           }
        }
        
        System.out.print(secondlargest);
	}
}




import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr[] = {1,1,2,2,3,4,4} ;
		
		HashSet <Integer> set = new HashSet<>();
		
		for(int num : arr){
		    set.add(num);
		}
		System.out.print(set);
	}
}


public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}



public class Main
{
	public static void main(String[] args) {
		int[] arr = {10,5,20,8} ;
		int n = arr.length ;
		int smallest = 0;
		
		for(int i = 0 ; i < n -1 ; i++) {
		    for(int j = i+1 ; j < n ; j++){
		        if(arr[j] - arr[i] > 0){
		            smallest = Math.max(arr[j]-arr[i], smallest) ; 
		        }
		    }
		}
		System.out.print(smallest);
	}
}


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int smallest = 0;
		
		for(int i = 0 ; i < n ; i++){
		    list.add(sc.nextInt());
		}
		
		for(int num : list){
		    if(num > smallest ){
		        smallest = num;		    }
		}
		System.out.print(smallest);
	}
}


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		
		Collections.sort(list);
		System.out.print(list);
	}
}


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,5,4,3,2,1));
		int n = list.size();
		
		for(int j = 0 ; j < n-1 ; j++){
		for(int i = 0 ; i < n-j-1 ; i++){
		    if(list.get(i) > list.get(i+1)){
		        int temp = list.get(i);
		        list.set(i , list.get(i+1));
		        list.set(i+1, temp);
		    }
		}
		}
		System.out.print(list);
	}
}


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0 ; i < n ; i++){
		    list.add(sc.nextInt());
		}
		
		int number = sc.nextInt();
		
		if(!list.contains(number)){
		    System.out.print("Element is not present in list");
		}
		
		int count = 0;
		
		for(int num : list){
		    if(num == number ){
		        count++;
		    }
		}
		System.out.print(number +  "presnt in list" + count + "times");
	}
}