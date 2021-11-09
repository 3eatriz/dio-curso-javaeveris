package listasDuplamenteEncadeadas;

public class ListaDuplamenteEncadeda<T> {
	
	private NoDuplo<T> primeiroNo;
	private NoDuplo<T> ultimoNo;
	private int tamanhoLista;
	
	public ListaDuplamenteEncadeda() {
		this.primeiroNo = null;
		this.ultimoNo = null;
		this.tamanhoLista = 0;
	}
	
	public boolean isEmpty() {
		return primeiroNo == null ? true : false;
	}
	
	public int size() {
		return tamanhoLista;
	}
	
	private NoDuplo<T> getNo(int index){
		NoDuplo<T> noAux = primeiroNo;
		for(int i=0;( i<index ) && ( noAux!=null ); i++) {
			noAux = noAux.getProximoNo();
		}
		return noAux;
	}
	
	public T get(int index) {
		return this.getNo(index).getConteudo();
	}
	
	@SuppressWarnings("unchecked")
	public T add(T elemento) {
		NoDuplo<T> novoNo = new NoDuplo<>(elemento);
		novoNo.setProximoNo(null);
		novoNo.setAnteriorNo(ultimoNo);
		if(primeiroNo == null) {
			primeiroNo = novoNo;
		}
		if(ultimoNo != null) {
			ultimoNo.setProximoNo(novoNo);
		}
		
		ultimoNo = novoNo;
		tamanhoLista++;
		return (T) novoNo;
	}

	@SuppressWarnings("unchecked")
	public T add(int index,  T elemento) {
		NoDuplo<T> noAux = getNo(index);
		NoDuplo<T> novoNo = new NoDuplo<>(elemento);
		novoNo.setProximoNo(noAux);
		if(novoNo.getProximoNo() != null) {
			novoNo.setAnteriorNo(noAux.getAnteriorNo());
			novoNo.getProximoNo().setAnteriorNo(novoNo);
		}
		else {
			novoNo.setAnteriorNo(ultimoNo);
			ultimoNo = novoNo;
		}
		if(index == 0) {
			primeiroNo = novoNo;
		}
		else {
			novoNo.getAnteriorNo().setProximoNo(novoNo);
		}
		tamanhoLista++;
		return (T) novoNo;
	}
	
	@SuppressWarnings("unchecked")
	public T remove(int index) {
		NoDuplo<T> noAux = getNo(index);
		if(index == 0) {
			primeiroNo = primeiroNo.getProximoNo();
			if(primeiroNo != null) {
				primeiroNo.setAnteriorNo(null);
			}
		}
		else {
			noAux.getAnteriorNo().setProximoNo(noAux.getProximoNo());
			if(noAux != ultimoNo) {
				noAux.getProximoNo().setAnteriorNo(noAux.getAnteriorNo());
			}
			else {
				ultimoNo = noAux.getAnteriorNo();
			}
		}		
		this.tamanhoLista--;
		return (T) noAux;
	}
	
	public String toString() {
		String str = "-=-=-=-=-=-=-=-| LISTA DUPLAMENTE ENCADEADA |-=-=-=-=-=-=-=-\n";
		str += "null";
		NoDuplo<T> noAux = primeiroNo;	
		for(int i = 0; i < this.size(); i++) {
			str += " -><- [" + noAux.getConteudo() + "]";
			noAux = noAux.getProximoNo();
		}
		str += " -><- null\n";
		str += "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-||-=-=-=-=-=-=-=-=-=-=-=-=-=-=-";
		return str;
	}
}
