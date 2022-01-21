package reus_act9_6;

public class Pelicula {
	private String titulo;
	private int duracion;
	private int edad_min;
	private String director;
	
	public Pelicula(String titulo, int duracion, int edad_min, String director) {
		super();
		this.titulo = titulo;
		this.duracion = duracion;
		this.edad_min = edad_min;
		this.director = director;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public int getDuracion() {
		return duracion;
	}
	
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public int getEdad_min() {
		return edad_min;
	}
	
	public void setEdad_min(int edad_min) {
		this.edad_min = edad_min;
	}
	
	public String getDirector() {
		return director;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}
	
}
