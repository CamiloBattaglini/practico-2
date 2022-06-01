package array;
import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int[] num=new int[5];
		int mayor=0;
		int menor=0;
		
		for(int i=0; i < 5 ; i++) {
			System.out.println("Ingrese 5 numeros: ");	
			num[i]=sc.nextInt();  
		}
		
		
		int mayor1, menor1;
			mayor1=menor1=num[0];
			
		for(int i = 0;i < 5;i++) {
			if (num[i]>mayor1) {
				mayor1=num[i];
				
			}
			else {
				menor1=num[i];
			}
		}
		
		System.out.println("numero menor: "+ menor1);
		System.out.println("numero mayor: "+ mayor1);
		
		
		
	}
	

}
