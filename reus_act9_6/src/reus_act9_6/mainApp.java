package reus_act9_6;

import java.util.ArrayList;
import java.util.Random;

public class mainApp {

	public static void main(String[] args) {
		Random rand = new Random();
		int entrada = 8;
		int edad_min = 12;
		int capacidad = 72;
		int personas = 80;
		ArrayList<Espectador> espectadores = new ArrayList<Espectador>();
		Espectador asientos[][] = new Espectador[8][9];
		Pelicula pelicula = new Pelicula("Alien",120,edad_min,"Ridley Scott");
		Cine cine = new Cine(pelicula,entrada);
		
		for(int i = 0; i < personas; i++)
			espectadores.add(new Espectador("Persona " + i, rand.nextInt(edad_min -2, edad_min + 4), rand.nextDouble(entrada -4, entrada + 6))) ;
			
		for(int i = 0; capacidad > 0 && i < personas; i++) {
			Espectador aux = espectadores.get(i);
			
			if(aux.getEdad() >= edad_min && aux.getDinero() >= entrada) {
				int fila = rand.nextInt(8);
				int columna = rand.nextInt(9);
				
				while(asientos[fila][columna] != null) {
					fila = rand.nextInt(8);
					columna = rand.nextInt(9);
				}
				
				asientos[fila][columna] = aux;
				capacidad--;
			}
		}
		
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 9; j++)
				if(asientos[i][j] != null)
					System.out.print(asientos[i][j].getNombre() + " ");
				else
					System.out.print( "Nada ");
			System.out.print("\n");
		}
			
	}

}