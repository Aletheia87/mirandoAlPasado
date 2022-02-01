package fiesta;

import java.util.Map;
import java.util.TreeMap;

public class Golosinas {

	public Golosinas() {
		System.out.println("GOLOSINAS:\n");
		Map<String, Integer> golosinas = new TreeMap<>();
		golosinas.put("Chocman", 100);
		golosinas.put("Trululú", 100);
		golosinas.put("Centella", 100);
		golosinas.put("Kilate", 50);
		golosinas.put("Miti-Miti", 30);
		golosinas.put("Traga Traga", 150);
		golosinas.put("Tabletón", 5);
		//System.out.println(golosinas + "\n");
		golosinas.entrySet().stream().filter(precio->precio.getValue()<100).forEach(System.out::print);

		System.out.println("\n__________________________________\n"); 
	}
}
