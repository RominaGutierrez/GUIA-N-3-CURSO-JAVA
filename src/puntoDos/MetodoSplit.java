package puntoDos;

public class MetodoSplit {

	public static void main(String[] args) {
		
		String listaDeNombres = "Romina,Fabián,Federico,Alejandro,Elias,Mateo,Noah,Zoe,Natalia,Matilde";
		String[] nombres = listaDeNombres.split(",");
		int posicion = nombres.length-1;
		//muestra los nombres uno abajo de otro en distintas lineas
		/*for(int i=0; i < nombres.length; i++) {
			System.out.println(nombres[i]);
		}*/
		
		//muestra los nombres en una linea separados con una coma y un punto al final
		
		for(int i=0; i < nombres.length; i++) {
			System.out.print(nombres[i]);
			if(i < posicion) {
				System.out.print(", ");
			} else {
				System.out.println(".");
			}
		}
	}

}
