package listasCirculares;

public class Principal {

	public static void main(String[] args) {
		ListaCircular<String> minhaLista = new ListaCircular<>();

		minhaLista.add("maçã");
//		
//		
		minhaLista.add("abacaxi");
		minhaLista.add("kiwi");

//		System.out.println(minhaLista);
//		minhaLista.remove(0);
//		System.out.println(minhaLista);
		minhaLista.add("uva");
//		System.out.println(minhaLista);
		minhaLista.add("pêra");
//		System.out.println(minhaLista);
//		System.out.println(minhaLista.get(5));
		System.out.println(minhaLista);
		for(int i = 0; i < 10; i++) {
			System.out.println(minhaLista.get(i));
		}
	}

}
