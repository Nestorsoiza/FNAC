package parquesur;

public class MainFnac {

	public static void main(String[] args) {
		 Libro libro1 = new Libro (1111111, "titulo1", "autor1", 130);
		 Libro libro2 = new Libro (2222222, "titulo2", "autor2", 60);
		 
		 System.out.println(libro1.toString());
		 System.out.println(libro2.toString());
		 
	
		 
		 if (libro1.getNumeroDePaginas() > libro2.getNumeroDePaginas()) {
			 System.out.println(libro1.getTitulo() + " tiene más páginas ");
			
		} else {
			System.out.println(libro2.getTitulo() + " tiene más páginas ");
		}
	}

}
