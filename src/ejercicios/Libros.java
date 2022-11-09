package ejercicios;

public class Libros {

	public static void main(String[] args) {
		
		Libro libro1 = new Libro("El sol", "1234", "Juan Pablo", 300);
		Libro libro2 = new Libro("La luna", "4321", "Pedro Pablo", 300);
		
		System.out.println("El libro uno es: ");
		libro1.mostrar();
		System.out.println("El libro dos es: ");
		libro2.mostrar();
		System.out.println("-----------------------------------------------");
		
		if(libro1.getPaginas() > libro2.getPaginas()) {
			System.out.println( libro1.getTitulo()+" tiene mas paginas que: " + libro2.getTitulo());
		}else if(libro1.getPaginas() == libro2.getPaginas()){
			System.out.println( libro2.getTitulo()+" tiene la misma cantidad de paginas que: " + libro1.getTitulo());
		}else {
			System.out.println( libro2.getTitulo()+" tiene mas paginas que: " + libro1.getTitulo());
		}

	}

}
