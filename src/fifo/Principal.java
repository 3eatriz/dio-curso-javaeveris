package fifo;

public class Principal {

	public static void main(String[] args) {
		
		Fila<String> minhaFila = new Fila<String>();
		
		minhaFila.enqueue("A");
		minhaFila.enqueue("B");
		minhaFila.enqueue("C");
		minhaFila.enqueue("D");
		minhaFila.enqueue("E");
		minhaFila.enqueue("F");
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-| FILA COMPLETA |-=-=-=-=-=-=-=-=-=-=-");
		System.out.println(minhaFila);
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-||-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

		System.out.println();
		System.out.println();
		
		for(int i=1; i <= minhaFila.getQntNo()-1; i++) {
			System.out.println("Retiramos o "+ i +"º elemento = " + minhaFila.dequeue() + " da fila");
			System.out.println("-=-=-| FILA ATUALIZADA |-=-=-");
			System.out.println(minhaFila);
			System.out.println("Primeiro da fila = " + minhaFila.first());
			System.out.println();
		}
	}
}
