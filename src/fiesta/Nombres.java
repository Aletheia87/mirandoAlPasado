package fiesta;

import java.util.Set;
import java.util.TreeSet;

public class Nombres {
	
	public Nombres() {
		System.out.println("COMPAÑEROS:\n");
		Set<String> invitados = new TreeSet<>();
		invitados.add("Daniel");
		invitados.add("Paola");
		invitados.add("Facundo");
		invitados.add("Pedro");
		invitados.add("Jacinta");
		invitados.add("Florencia");
		invitados.add("Juan Pablo");
		System.out.println("Invitados:" + invitados + ""); 
		
	
	
		Set<String> posiblesInvitados = new TreeSet<>();
		posiblesInvitados.add("Jorge");
		posiblesInvitados.add("Francisco");
		posiblesInvitados.add("Marcos");
		/*System.out.println("Posibles Invitados:" + posiblesInvitados + "");*/
		
		Set<String> invitadosUnidos = new TreeSet<>(invitados);
		invitadosUnidos.addAll(posiblesInvitados);
		System.out.println("Lista Invitados:" + invitadosUnidos + ""); 
		
		invitadosUnidos.remove("Jorge");
		System.out.println("Listado final:" + invitados + ""); 
		
		System.out.println("\n__________________________________\n"); 
	}
}
