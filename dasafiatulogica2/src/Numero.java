

import java.util.Scanner;

public class Numero {
	
	public static void main(String[] args) {
		int num;
		boolean bandera = true;
		
	    do {
	    	Scanner sc = new Scanner(System.in);
			
			System.out.print("Introduzca un número positivo: ");
		    num = sc.nextInt();
		    
		    if(num > 0) {
		    	int nu20 = num +20;
		    	System.out.println("Los siguientes 20 numeros de " + num + " son: ");
		    	
		    	for(int i = num+1; i <= nu20; i++) {
		    		System.out.println(i);
		    	}
		    	
		    	bandera = false;
		    } else {
		    	System.out.println("El número " + num + " no es positivo.");
		    }

		    
	    } while (bandera);
	    
	}

}