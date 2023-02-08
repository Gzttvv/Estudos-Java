package basicos;
import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Beecrowd_1020 {
 
    public static void main(String[] args) throws IOException {
    		
    	Scanner sc = new Scanner (System.in);
    	
    	
        int dias = sc.nextInt();
        
        int ano,meses,dias2;
        
        ano = dias/365;
        meses = (dias%365) / 30;
        dias2 = (dias%365) % 30;
        
        System.out.println(ano +" ano(s)");
        System.out.println(meses +" mes(s)");
        System.out.println(dias2 +" dia(s)");
        
        sc.close();
    }
 
}
