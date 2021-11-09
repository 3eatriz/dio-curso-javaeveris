package fifo;

public class Fila<T> {
	
	private No<T> refNoEntradaFila;
	private Integer qntNo = 0;

	public Fila() {
		this.refNoEntradaFila = null;
	}
	
	public Integer getQntNo() {
		return qntNo;
	}
	
	public boolean isEmpty() {
		return refNoEntradaFila == null ? true : false;
	}
	
	public void enqueue(T obj) {
		No<T> novoNo = new  No<T>(obj);
		novoNo.setRefNo(refNoEntradaFila);
		refNoEntradaFila = novoNo;
		qntNo++;
	}
	
	public T first() {
		if(!this.isEmpty()) {
			No<T> primeiroNo = refNoEntradaFila;
			while(true) {
				if(primeiroNo.getRefNo() != null) {
					primeiroNo = primeiroNo.getRefNo();
				}
				else {
					break;
				}
			}
			return (T) primeiroNo.getObj();
		}
		return null;
	}
	
	public T dequeue() {
		if(!this.isEmpty()) {
			No<T> primeiroNo = refNoEntradaFila;
			No<T> noAuxiliar = refNoEntradaFila;
			while(true) {
				if(primeiroNo.getRefNo() != null) {
					noAuxiliar = primeiroNo;
					primeiroNo = primeiroNo.getRefNo();
				}
				else {
					noAuxiliar.setRefNo(null);
					break;
				}
			}
			return (T) primeiroNo.getObj();
		}
		return null;
	}

	@Override
	public String toString() {
		String stringRetorno = "------------------------------------------------------------\n";
		stringRetorno += "			Fila\n";
		stringRetorno += "------------------------------------------------------------\n";
		No<T> noAuxiliar = refNoEntradaFila;
		
		if(!this.isEmpty()) {
			while(true) {
				stringRetorno += "[" + noAuxiliar.getObj() + "] ---> ";
				if(noAuxiliar.getRefNo() != null) {
					noAuxiliar = noAuxiliar.getRefNo();
				}
				else {
					stringRetorno += " null";
					break;
				}
			}
		}
		else {
			stringRetorno = "[null]";
		}
		stringRetorno += "\n============================================================";
		return stringRetorno;
	}
	
	
	
}
