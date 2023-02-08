package basicos;

import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1042 {

	public static void main(String[] args) throws IOException {
		 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int[] arr =  new int[3];
        int[] arrCopy = new int[arr.length];
        
        
        for (int i = 0 ; i < arr.length; i++) {
        	arr[i] = sc.nextInt();
        }
        for(int i = 0; i < arrCopy.length;i++) {
        	arrCopy[i] =  arr[i];
        }
        
        Arrays.sort(arr);
        
        for (int i = 0 ; i < arr.length; i++) {
        	System.out.println(arr[i]);
        }
        System.out.println("");
        
        for (int x:arrCopy) {
        	System.out.println(x);
        }
        
        sc.close();
 
    }

}
