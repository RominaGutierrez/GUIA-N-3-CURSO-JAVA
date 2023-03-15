package puntoUno;

import java.text.Normalizer;
/*
 * Dado un String y una letra, que cuente la cantidad de apariciones de la letra en el String
 */
public class PuntoA {

	public static void main(String[] args) {
		String palabra = "Los loros loc�s";
		char letra = 'o';
		int contador = 0;
		//Para contar tambi�n las letras con acento, usar la clase java.text.Normalizer de Java para normalizar la cadena, y convertir todas las letras acentuadas a su forma no acentuada antes de contar las ocurrencias de la letra dada.
		String palabraSinAcento = Normalizer.normalize(palabra, Normalizer.Form.NFD).replaceAll("\\p{M}","");
		//Para contar las letras m�yusculas como las min�sculas, convertimos las letras del String y la letra de char en min�sculas o may�sculas	
		// Character.toUpperCase(letra); convierta a letra en mayusculas
		//palabra.length = 3
		for(int i=0; i<palabra.length(); i++) {
			if(palabraSinAcento.toUpperCase().charAt(i) == Character.toUpperCase(letra)) {
				contador++;
			}
		}
		
		System.out.println("En "+ palabra + " ,hay " + contador +" letras "+ letra + ".");


	}

}
