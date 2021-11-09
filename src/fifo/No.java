package fifo;

public class No<T> {

	private T obj;
	private No<T> refNo;
	
	public No(){}
	
	public No(T obj) {
		this.refNo = null;
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	public No<T> getRefNo() {
		return refNo;
	}

	public void setRefNo(No<T> refNo) {
		this.refNo = refNo;
	}

	@Override
	public String toString() {
		return "[" +obj+"]";
	}	
}
