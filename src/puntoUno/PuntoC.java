package puntoUno;

public class PuntoC {

	public static void main(String[] args) {
		
		//Inicializar vector con valores espec�ficos en la declaraci�n
		int [] numeros = {5,8,9,3,25};
		int numero = 8, suma=0;
		
		for(int i=0; i < numeros.length; i++) {
			if(numeros[i]>numero) {
				suma += numeros[i];
			}
		}
		
		System.out.println("La suma de los n�meros mayores a "+numero+" es: "+suma);
		
	}

}
