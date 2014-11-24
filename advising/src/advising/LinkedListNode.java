package advising;

public class LinkedListNode <T extends Comparable<T>>{
	T data;
	T data2;
	T data3;
	T data4;
	T data5;
	LinkedListNode <T> left;
	LinkedListNode <T> right;
	
	public LinkedListNode(T data, T data2, T data3, T data4, T data5) {
		this.data = data;
		this.data2=data2;
		this.data3=data3;
		this.data4=data4;
		this.data5=data5;
		left = null;
		right = null;
	}
	
	public LinkedListNode(T data, T data2, T data3) {
		this.data = data;
		this.data2=data2;
		this.data3=data3;
		left = null;
		right = null;
	}

	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}

	public T getData2() {
		return data2;
	}

	public void setData2(T data2) {
		this.data2 = data2;
	}
	
	public T getData3() {
		return data3;
	}

	public void setData3(T data3) {
		this.data3 = data3;
	}
	
	public T getData4() {
		return data2;
	}

	public void setData4(T data4) {
		this.data4 = data4;
	}
	public T getData5() {
		return data5;
	}

	public void setData5(T data5) {
		this.data5 = data5;
	}
	public LinkedListNode<T> getLeft() {
		return left;
	}

	public void setLeft(LinkedListNode<T> left) {
		this.left = left;
	}

	public LinkedListNode<T> getRight() {
		return right;
	}

	public void setRight(LinkedListNode<T> right) {
		this.right = right;
	}
	
}
