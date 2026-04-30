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



