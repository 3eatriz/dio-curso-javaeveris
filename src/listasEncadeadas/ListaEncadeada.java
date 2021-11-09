package listasEncadeadas;

public class ListaEncadeada<T> {

	private No<T> referenciaEntrada;
	
	public ListaEncadeada(){
		this.referenciaEntrada = null;
	}
	
	public boolean isEmpty() {
		return referenciaEntrada == null ? true : false;
	}
	
	public int size() {
		int tamanhoLista = 0;
		No<T> referenciaAux = referenciaEntrada;
		while(true) {
			if(!this.isEmpty()) {
					tamanhoLista++;
					if(referenciaAux.getProximoNo() != null) {
						referenciaAux = referenciaAux.getProximoNo();
					}
					else {
						break;
					}
			}
			else {
				break;
			}
		}
		return tamanhoLista;
	}
	
	public void add(T conteudo) {
		No<T> novoNo = new No<>(conteudo);
		
		if(this.isEmpty()) {
			referenciaEntrada = novoNo;
			return;
		}
		
		No<T> noAux = referenciaEntrada;
		for(int i = 0; i < this.size()-1; i++) {
			noAux = noAux.getProximoNo();
		}
		
		noAux.setProximoNo(novoNo);
	}
	
	private No<T> getNo(int index){		
		validaIndice(index);
		No<T> noAux = referenciaEntrada;
		No<T> noRetorno = null;
		
		for(int i = 0; i < index+1; i++) {
			noRetorno = noAux;
			noAux = noAux.getProximoNo();
		}
		return noRetorno;
	}
	
	public T get(int index){
		return getNo(index).getConteudo();
	}
	
	public T remove(int index) {
		No<T> noPivor = this.getNo(index);
		if(index == 0) {
			referenciaEntrada = noPivor.getProximoNo();
			return noPivor.getConteudo();
		}
		No<T> noAnterior = getNo(index - 1);
		noAnterior.setProximoNo(noPivor.getProximoNo());
		return noPivor.getConteudo();
	}
	
	private void validaIndice(int index) {
		if(index >= size()) {
			int ultimoIndice = size()-1;
			throw new IndexOutOfBoundsException("Não existe conteúno do índice " + index + " desta lista. Esta lista só vai até o índice: " + ultimoIndice);
		}
	}

	@Override
	public String toString() {
		String str = "-=-=-| LISTA ENCADEADA |-=-=-\n";
		No<T> noAux = referenciaEntrada;
		for(int i = 0; i < this.size(); i++) {
			str += " -> [" + noAux.getConteudo() + "]";
			noAux = noAux.getProximoNo();
		}
		str += " -> null\n";
		str += "-=-=-=-=-=-=-=-||-=-=-=-=-=-=-=-";
		return str;
	}
	
	
	
}
