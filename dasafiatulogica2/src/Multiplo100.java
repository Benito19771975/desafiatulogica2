
public class Multiplo100 {

	

	public static void main(String[] args) {
		
		
		int contador=0;// variable contador donde sumará los multiplos que hay en total de 2 o de 3
		
		System.out.print(" El total de los multiplos de dos son: ");
		
		for ( int i2=1; i2<101;  i2++) {            //Operación para calcular los multiplos de 2 
		    if (i2%2==0) 
		    {
			System.out.print(i2+",");// Salida que imprime los multiplos de 2
			contador++;
			}
		}   
		System.out.println(" Hay "+ contador+ " multiplos de 2");	//Salida que imprime el total de multiplos de 2 que hay
		    
		contador= 0;
		System.out.print(" El total de los multiplos de tres son: ");
		for (int i3 = 1; i3< 101; i3++) {//Operación para calcular los multiplos de 3 
		   if (i3 % 3 ==0) {
			System.out.print( i3+ " , ");// Salida que imprime los multiplos de 3
			contador++;
			}
			
		
		}
		System.out.println(" Hay "+ contador+ " multiplos de 3");
	
	

	}
	}


