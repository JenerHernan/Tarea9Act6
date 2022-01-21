package reus_act9_6;

public class Cine {
	private Pelicula pelicula;
	private double entrada;
	
	public Cine(Pelicula pelicula, double entrada) {
		super();
		this.pelicula = pelicula;
		this.entrada = entrada;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}
	
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	
	public double getEntrada() {
		return entrada;
	}
	
	public void setEntrada(double entrada) {
		this.entrada = entrada;
	}


}
