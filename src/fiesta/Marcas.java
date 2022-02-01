package fiesta;

import java.util.ArrayList;

public class Marcas {

	public Marcas() {
		System.out.println("MARCAS: \n");
		ArrayList<String> marcas = new ArrayList<>();
		marcas.add("Free");
		marcas.add("Michaely");
		marcas.add("Almac");
		marcas.add("Cheldiz");
		marcas.add("TuGurt");
		marcas.add("Ego");
		marcas.add("Magic Kids");
		marcas.add("Hicory Hill");
		marcas.add("Fox Kids");
		marcas.add("Feria del Disco");
		System.out.println(marcas +" ");
		
		marcas.add("Blokbaster");
		marcas.add("Carrefour");
		marcas.add("Jetix");
		System.out.print(marcas + "\n");
		
		
		marcas.set(10, "Blockbuster");
		System.out.print(marcas + "\n");
		
		marcas.remove("Carrefour");
		System.out.print(marcas+ "\n");
		
		ArrayList<String> posiblesMarcas = new ArrayList<>();
		posiblesMarcas.add("Parada111");
		posiblesMarcas.add("HomeDepot");
		posiblesMarcas.add("JCPenney");
		marcas.addAll(posiblesMarcas);
		System.out.print(marcas+ "\n");
		System.out.print("Cantidad de marcas: "+ marcas.size());
		System.out.println("\n__________________________________\n"); 
	}
}


