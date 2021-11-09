package listasDuplamenteEncadeadas;

public class Principal {

	public static void main(String[] args) {
		ListaDuplamenteEncadeda<Integer> minhaListaDupla = new ListaDuplamenteEncadeda<>();
		
		minhaListaDupla.add(1);
		minhaListaDupla.add(2);
		minhaListaDupla.add(3);
		minhaListaDupla.add(4);
		minhaListaDupla.add(5);
		
		System.out.println(minhaListaDupla);
		
		System.out.println("Item " + minhaListaDupla.remove(2) + " removido da lista");
		System.out.println(minhaListaDupla);
		
		System.out.println("Item " + minhaListaDupla.add(2, 7) + " adicionado na lista");
		System.out.println(minhaListaDupla);
		System.out.println("Minha lista tem " + minhaListaDupla.size() + " elementos");
		System.out.println(minhaListaDupla);
		System.out.println("Item " + minhaListaDupla.remove(0) + " removido da lista");
		System.out.println(minhaListaDupla);
		System.out.println("Item " + minhaListaDupla.remove(3) + " removido da lista");
		System.out.println("Item " + minhaListaDupla.add(8)+ " adicionado na lista");
		System.out.println(minhaListaDupla);
		
		
		
		
	}

}
