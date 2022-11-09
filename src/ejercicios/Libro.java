package ejercicios;

public class Libro {

	private String ISBN;
	private String titulo;
	private String autor;
	private int paginas;
	
	public Libro(String titulo,String ISBN,String autor, int paginas ) {
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
		
	}
	
	public void mostrar() {
		System.out.println("El libro " + titulo + " con su ISBN " + ISBN + " creado por " + autor + " tiene " + paginas + " paginas.");
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
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

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	
	
	
	
}
