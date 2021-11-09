package listasEncadeadas;

public class Principal {

	public static void main(String[] args) {
		ListaEncadeada<String> minhaLista = new ListaEncadeada<>();
		
		minhaLista.add("cu1");
		minhaLista.add("cu2");
		minhaLista.add("cu3");
		minhaLista.add("cu4");

		System.out.println(minhaLista);
		System.out.println("Item 3 da minha lista: " + minhaLista.get(3));
		
		System.out.println(minhaLista.remove(2) + " removido da lista");
		System.out.println(minhaLista);
	}

}
