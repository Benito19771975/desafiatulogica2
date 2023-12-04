
import java.util.Scanner;
public class Orden {

	public static void main(String[] args) {
		int a;                               // variable que graba el primer número
		int b;                               // variable que graba el segundo número
		int c;                               // variable que graba el tercer número
        
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce un número"); // se pide el primer número
		 a = scanner.nextInt();
		
		System.out.print("Introduce el segundo número");// se pide el segundo número
		b = scanner.nextInt();
		
		System.out.print("Introduce el tercer número");// se pide el tercer número
		c= scanner.nextInt();
		
		
		System.out.print("Seleccione el orden, 1 para orden ascendente o 2 para orden descendente");// se pide el orden 
		
		 int orden = scanner.nextInt();       // variable que graba el orden que se quiere ver los números
		 
		 String asc = "1";// declara un tipo de orden ascendente
		 String des = "2";// declara un tipo de orden descendente
		 
		 
		
		// se opera los diferentes ordenes de los números introducidos
		if (a > b && b > c){
		asc = ("El orden ascendente es:" + c+","+b+","+a+",");
		des = ("El orden descendente es:" + a+","+b+","+c+",");
	    }else if (a > c && c > b) {
			asc = ("El orden ascendente es:" + b+","+c+","+a+",");
			des = ("El orden descendente es:" + a+","+c+","+b+",");	
		}else if (b > a && a > c) {
			asc = ("El orden ascendente es:" + c +","+a+","+b+",");
			des = ("El orden descendente es:" + b+","+a+","+c+",");
		}else if (b > a && c > b) {
			asc = ("El orden ascendente es:" +a+","+b+","+c+",");
			des = ("El orden descendente es:" + c+","+b+","+a+",") ;
			
				
		}else if (c > a && a > b) {
			asc = ("El orden ascendente es:" + b+","+a+","+c+",");
			des = ("El orden descendente es:" + c+","+a+","+b+",") ;
			
		}
		// se imprime en patalla según el orden requerido
		switch (orden) {
		case 1 :
			System.out.println(asc);
			break;
		case 2 :
			System.out.println(des);
			break;
			default :
				System.out.print("Opción no correcta");
			
		
		}
	}

}
