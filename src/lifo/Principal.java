package lifo;

public class Principal {

	public static void main(String[] args) {
		
		Pilha minhaPilha = new Pilha();

		minhaPilha.push(new No(1));
		minhaPilha.push(new No(2));
		minhaPilha.push(new No(3));
		minhaPilha.push(new No(4));
		minhaPilha.push(new No(5));
		minhaPilha.push(new No(6));
		
		minhaPilha.pop();
		
		No topo = minhaPilha.top();
		
		System.out.println(minhaPilha);
		
		System.out.println("O todo ta pilha contém: " + topo);
		
		System.out.println("Minha pilha é vazia?: " + minhaPilha.isEmpty());
		
		minhaPilha.push(new No(10));
		
		System.out.println("--------------------------");
		System.out.println(minhaPilha);
	}

}
