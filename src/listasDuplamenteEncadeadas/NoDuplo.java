package listasDuplamenteEncadeadas;

public class NoDuplo<T> {
	
	private T conteudo;
	private NoDuplo<T> proximoNo;
	private NoDuplo<T> anteriorNo;
	
	public NoDuplo() {
		this.proximoNo = null;
		this.anteriorNo = null;
	}
	
	public NoDuplo(T conteudo) {
		this.conteudo = conteudo;
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public NoDuplo<T> getProximoNo() {
		return proximoNo;
	}

	public void setProximoNo(NoDuplo<T> proximoNo) {
		this.proximoNo = proximoNo;
	}

	public NoDuplo<T> getAnteriorNo() {
		return anteriorNo;
	}

	public void setAnteriorNo(NoDuplo<T> anteriorNo) {
		this.anteriorNo = anteriorNo;
	}
	
	@Override
	public String toString() {
		return "[" + conteudo + "]";
	}
	
	public String toStringDupEnc() {
		String str = "null";
		str = " <- [" + conteudo + "]";
		
		if(proximoNo != null) {
			str += " -> " + proximoNo.toString();
		}
		else {
			str += " -> null";
		}
		return str;
	}
	
}
