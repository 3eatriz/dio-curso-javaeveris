package arvoresBinarias;

public class Principal {

	public static void main(String[] args) {
		ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
		
		arvore.inserir(13);
		arvore.inserir(10);
		arvore.inserir(25);
		arvore.inserir(2);
		arvore.inserir(12);
		arvore.inserir(20);
		arvore.inserir(31);
		arvore.inserir(29);
		
		arvore.exibirPreOrdem();
		arvore.exibirEmOrdem();
		arvore.exibirPosOrdem();
		
	}

}
