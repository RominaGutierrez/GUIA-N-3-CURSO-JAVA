package puntoUno;

public class PuntoC {

	public static void main(String[] args) {
		
		//Inicializar vector con valores específicos en la declaración
		int [] numeros = {5,8,9,3,25};
		int numero = 8, suma=0;
		
		for(int i=0; i < numeros.length; i++) {
			if(numeros[i]>numero) {
				suma += numeros[i];
			}
		}
		
		System.out.println("La suma de los números mayores a "+numero+" es: "+suma);
		
	}

}
