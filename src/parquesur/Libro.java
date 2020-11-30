package parquesur;

public class Libro {
	private int ISBN;
	private String titulo;
	private String autor;
	private int numeroDePaginas;
	
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}
	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}
	@Override
	public String toString() {
		return "El libro " +  titulo + " con ISBN " + ISBN +  " creado por el autor " 
				+ autor + " tiene "  + numeroDePaginas + " paginas ";
				 
				
	}
	public Libro(int iSBN, String titulo, String autor, int numeroDePaginas) {
		ISBN = iSBN;
		this.titulo = titulo;
		this.autor = autor;
		this.numeroDePaginas = numeroDePaginas;
	}
	
	
	
}
