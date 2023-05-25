package Pila;

import java.io.FileWriter;
import java.io.IOException;

public class Escribir {
// Recibe por parametros el nombre del fichero que se puede cambiar en la clase start 
	// y un objeto Pila para imprimirloen el archivo de texto
	public void EscribirFichero(String nombreFichero, Pila pila) throws IOException {
		FileWriter bw = new FileWriter(nombreFichero);

		bw.write(pila.toString());

		bw.close();

	}

}
