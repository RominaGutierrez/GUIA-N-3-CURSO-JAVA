package puntoUno;

public class PuntoB {
/*Dados 3 números y un orden (ascendente o decreciente) que ordene
 * los mismos y los retorne en un vector de 3
 */
	public static void main(String[] args) {
		
		int num1=10, num2=2, num3=3, aux=0;
		boolean ascendente = true;
		int []numeros = {num1, num2, num3};
		
		for( int i=0; i<numeros.length-1; i++) {
			for(int j=1; j <numeros.length-i;j++) {
				if(ascendente) {
					if(numeros[j-1]>numeros[j]) {
						aux = numeros[j-1];
						numeros[j-1]= numeros[j];
						numeros[j]= aux;
					}
				} else {
					if(numeros[j-1]<numeros[j]) {
						aux = numeros[j-1];
						numeros[j-1]= numeros[j];
						numeros[j]= aux;
					}
				}
			}
		}

		for(int i=0; i<numeros.length; i++) {
			System.out.print(numeros[i]);
			if(i < numeros.length-1) {
				System.out.print(", ");
			} else {
				System.out.println(".");
			}
		}

	}

}
