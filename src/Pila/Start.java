package Pila;

import java.io.IOException;

public class Start {
	public static void main(String[] args) throws IOException {
//llamo a los metodos y creo un objeto Pila y uno Escribir
		String archivo = "C:\\Users\\Mañana\\Downloads\\Pila.txt";
		Pila pila = new Pila();
		Escribir escribir = new Escribir();
		try {

			for (int i = 0; i < 40; i++) {
				pila.añadir((int) (Math.random() * 100));
			}
		} catch (NumeroMaximoElementosException e) {

			e.printStackTrace();
		}

		System.out.println(pila.toString());
		pila.extraer();
		
		System.out.println(pila.toString());
		pila.elementos();

		escribir.EscribirFichero(archivo,pila);

	}
}
