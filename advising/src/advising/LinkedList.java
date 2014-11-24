package advising;

import advising.LinkedListNode;
import advising.DataNotFoundException;
import advising.EmptyLinkedListException;

public class LinkedList<T extends Comparable<T>> {
	LinkedListNode<T> root;
	static int length;
	boolean found = false;

	public LinkedList() {
		root = null;
		length = 0;
	}

	public void addFull(T data, T data2, T data3, T data4, T data5) {
		// TODO Auto-generated method stub
		root = recAddFull(data, data2, data3, data4, data5, this.root);
		length += 1;
	}

	private LinkedListNode<T> recAddFull(T data, T data2, T data3, T data4, T data5, LinkedListNode<T> tree) {
		// TODO Auto-generated method stub
		if (tree == null) {
			tree = new LinkedListNode<T>(data, data2, data3, data4, data5);
		} else if (data2.compareTo(tree.getData2()) <= 0) {
			tree.setLeft(recAddFull(data, data2, data3, data4, data5, tree.getLeft()));
		} else if (data2.compareTo(tree.getData2()) > 0) {
			tree.setRight(recAddFull(data, data2, data3, data4, data5, tree.getRight()));
		}
		return tree;
	}
	
	public void add(T data, T data2, T data3) {
		// TODO Auto-generated method stub
		root = recAdd(data, data2, data3, this.root);
		length += 1;
	}

	private LinkedListNode<T> recAdd(T data, T data2, T data3, LinkedListNode<T> tree) {
		// TODO Auto-generated method stub
		if (tree == null) {
			tree = new LinkedListNode<T>(data, data2, data3);
		} else if (data2.compareTo(tree.getData2()) <= 0) {
			tree.setLeft(recAdd(data, data2, data3, tree.getLeft()));
		} else if (data2.compareTo(tree.getData2()) > 0) {
			tree.setRight(recAdd(data, data2, data3, tree.getRight()));
		}
		return tree;
	}

	public boolean remove(T data) throws EmptyLinkedListException {
		// TODO Auto-generated method stub
		if (!isEmpty()) {
			try {
				root = recRemove(data, this.root);
			} catch (DataNotFoundException e) {
				// TODO Auto-generated catch block

			}
		} else {
			throw new EmptyLinkedListException("LinkedList is empty!");
		}

		length -= 1;
		return found;
	}

	private LinkedListNode<T> recRemove(T data2, LinkedListNode<T> tree)
			throws EmptyLinkedListException, DataNotFoundException {
		// TODO Auto-generated method stub
		if (tree == null) {
			found = false;
		} else if (data2.compareTo(tree.getData2()) < 0) {
			tree.setLeft(recRemove(data2, tree.getLeft()));
		} else if (data2.compareTo(tree.getData2()) > 0) {
			tree.setRight(recRemove(data2, tree.getRight()));
		} else {
			found = true;
			tree = removeNode(tree);

		}
		return tree;

	}

	private LinkedListNode<T> removeNode(LinkedListNode<T> tree) throws EmptyLinkedListException,
			DataNotFoundException {
		if (tree.getLeft() == null) {
			return tree.getRight();
		} else if (tree.getRight() == null) {
			return tree.getLeft();
		} else {
			LinkedListNode<T> temp = findHighestLeft(tree.getLeft());
			tree.setData(temp.getData());
			tree.setLeft(recRemove(temp.getData(), tree.getLeft()));
		}
		return tree;
	}

	private LinkedListNode<T> findHighestLeft(LinkedListNode<T> tree) {
		// TODO Auto-generated method stub
		while (tree.getRight() != null) {
			tree = tree.getRight();
		}
		return tree;
	}

	public String search(T data2)throws EmptyLinkedListException //searches student info for userID
		{LinkedListNode<T> trunk = null;
		String answer ="";
		if ((!isEmpty())) {
			try {
				trunk = recSearch(data2, this.root);
			} catch (DataNotFoundException e) {
							}
		} else {
			throw new EmptyLinkedListException("LinkedList is empty!");
		}

				if (found)
					{answer =trunk.getData()+ " - "+ trunk.getData2();}
				else 
					{answer=" Word not present. Would you like to add it?";}
		return answer;}
	
	private LinkedListNode<T> recSearch(T data, LinkedListNode<T> tree) throws EmptyLinkedListException, DataNotFoundException {
			// TODO Auto-generated method stub
			if ((tree == null)) {
				found = false;
			} else if (data.compareTo(tree.getData()) < 0) {
				tree.setLeft(recSearch(data, tree.getLeft()));
				System.out.println("b3");
			} else if (data.compareTo(tree.getData()) > 0) {
				tree.setRight(recSearch(data, tree.getRight()));
				System.out.println("k2");
				
			} else {
				found = true;
			}
			
			return tree;
		
	}

	
	public boolean contains(T data) {
		return recContains(data, this.root);
	}
	
	private boolean recContains(T data, LinkedListNode<T> root) {
		// when root is null
		if (root == null) {
			return false;
		}

		if (data.compareTo(root.getData()) == 0) {
			return true;
		} else if (data.compareTo(root.getData()) < 0) {
			return recContains(data, root.getLeft());
		} else {
			return recContains(data, root.getRight());
		}
		// return false;

	}
	
	
	static public int getSize() {
		return length;
	}

	
	public boolean isEmpty() {
		return (root == null);
	}

	public String toPrintString() //sends formated string to other methods for printing
	{ String printString = "";
		printString = makePrintString(this.root); //uses this format to keep LInked List functions in the Linked List
		return printString;}
	
	public String makePrintString(LinkedListNode<T> tree) //formats information so that it can be written into a text file
		{String printString = "";
		if (tree != null) {
			makePrintString(tree.getLeft());
			// Root
			printString = tree.getData() +"&"+ tree.getData2() + "&"+ tree.getData3() + "&"+ tree.getData4() + "&"+ tree.getData5()+ "\n";

			// Right
			makePrintString(tree.getRight());
		}return printString;}
	
	}
