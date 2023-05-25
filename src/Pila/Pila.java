package Pila;

import java.util.ArrayList;

public class Pila {

	ArrayList<Integer> numeros;

	// creo la clase pila y su contructor
	public Pila() {

		numeros = new ArrayList<>();

	}

	public ArrayList<Integer> getNumeros() {
		return numeros;
	}

//añado los numeros si el arrays tiene menos de 30
	public void añadir(int numero) throws NumeroMaximoElementosException {

		if (numeros.size() < 30) {

			numeros.add(numero);

		} else {

			throw new NumeroMaximoElementosException("Numero Maximo Elementos");

		}
	}

//miro si esta vacio el arraylist y extraigo el numero si no lo esta
	public void extraer() {

		if (numeros.isEmpty()) {
			System.out.println("No hay mas elementos");
		} else {

			for (int i = numeros.size(); i < numeros.size() - 1; i--) {

				numeros.remove(i);
			}
		}
	}

//Meto la cantidad de elementos en una variable
	public int elementos() {
		int numero = numeros.size();

		return numero;
	}

	public boolean vacio() {

		return numeros.isEmpty();

	}

	public boolean llena() {

		if (numeros.size() == 30)
			return true;
		else
			return false;

	}

	public String toString() {
		return "Pila [numeros=" + numeros + "]";
	}

}
