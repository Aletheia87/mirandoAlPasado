package fiesta;

import java.util.LinkedList;
import java.util.Queue;

public class Juegos {
	
	public Juegos() {
		System.out.println("JUEGOS:\n");
		Queue<String> juegos = new LinkedList<>();
		juegos.add("Tombo");
		juegos.add("Congelado");
		juegos.add("Quemaditas");
		juegos.add("Cachipún");
		juegos.add("Pillarse");
		
		System.out.println("Cantidad de Juegos: "+ juegos.size());

		System.out.println("\n__________________________________\n"); 
	}

}
