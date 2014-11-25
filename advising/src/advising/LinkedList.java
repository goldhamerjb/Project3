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

	public void ChangeData(T data, T data2, T data3)
		{
		root = recChangeData(data, data2, data3, this.root);
		}
	
	private LinkedListNode<T> recChangeData(T data, T data2, T data3, LinkedListNode<T> tree) {
		// not finished, should edit data
		if (tree == null) {
			tree = new LinkedListNode<T>(data, data2, data3);
		} else if (data2.compareTo(tree.getData2()) < 0) {
			tree.setLeft(recAdd(data, data2, data3, tree.getLeft()));
		} else if (data2.compareTo(tree.getData2()) > 0) {
			tree.setRight(recAdd(data, data2, data3, tree.getRight()));
		}
		return tree;
	}
	
	public void addFull(T data, T data2, T data3, T data4, T data5) {
		// receives data from GUI, uses to make a new class in the linked list
		root = recAddFull(data, data2, data3, data4, data5, this.root);
		length += 1;
	}

	private LinkedListNode<T> recAddFull(T data, T data2, T data3, T data4, T data5, LinkedListNode<T> tree) {
		// uses recursion to put class in order according to user id.
		if (tree == null) {
			tree = new LinkedListNode<T>(data, data2, data3, data4, data5);
		} else if (data2.compareTo(tree.getData2()) < 0) {
			tree.setLeft(recAddFull(data, data2, data3, data4, data5, tree.getLeft()));
		} else if (data2.compareTo(tree.getData2()) > 0) {
			tree.setRight(recAddFull(data, data2, data3, data4, data5, tree.getRight()));
		}
		return tree;
	}
	
	public void add(T data, T data2, T data3) {
		// this method adds items to the linked list that are not full
		root = recAdd(data, data2, data3, this.root);
		length += 1;
	}

	private LinkedListNode<T> recAdd(T data, T data2, T data3, LinkedListNode<T> tree) {
		// checks to make sure no duplicate items(based on select data)
		// uses recursion to check entire list
		if (tree == null) {
			tree = new LinkedListNode<T>(data, data2, data3);
		} else if (data2.compareTo(tree.getData2()) < 0) {
			tree.setLeft(recAdd(data, data2, data3, tree.getLeft()));
		} else if (data2.compareTo(tree.getData2()) > 0) {
			tree.setRight(recAdd(data, data2, data3, tree.getRight()));
		}
		return tree;
	}

	public boolean remove(T data2) throws EmptyLinkedListException {
		// public method that removes information from linked list
		// this method only passes on information to private methods
		if (!isEmpty()) {
			try {
				root = recRemove(data2, this.root);
			} catch (DataNotFoundException e) { 
			}
		} else {
			throw new EmptyLinkedListException("LinkedList is empty!");
		}
		return found;
	}

	private LinkedListNode<T> recRemove(T data2, LinkedListNode<T> tree)
			throws EmptyLinkedListException, DataNotFoundException {
		// searches to find data in linked list
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

	private LinkedListNode<T> removeNode(LinkedListNode<T> tree) throws EmptyLinkedListException, DataNotFoundException 
	{	//once node is found by previous methods, removes node
		if (tree.getLeft() == null) {
			return tree.getRight();
		} else if (tree.getRight() == null) {
			return tree.getLeft();
		} else {
			LinkedListNode<T> temp = findHighestLeft(tree.getLeft());
			tree.setData(temp.getData());
			tree.setLeft(recRemove(temp.getData(), tree.getLeft()));
		}
		length -= 1;
		return tree;
	}

	private LinkedListNode<T> findHighestLeft(LinkedListNode<T> tree) {
		// gets top of the linked list
		while (tree.getRight() != null) {
			tree = tree.getRight();
		}
		return tree;
	}

	public boolean contains(T data2) {
		//returns either True or False based on recContains, searches for userID
		return recContains(data2, this.root);
	}
	
	private boolean recContains(T data2, LinkedListNode<T> root) {
		// when root is null returns false, otherwise uses recursion to search linked list for data match
		if (root == null) {
			return false;
		}

		if (data2.compareTo(root.getData2()) == 0) {
			return true;
		} else if (data2.compareTo(root.getData2()) < 0) {
			return recContains(data2, root.getLeft());
		} else {
			return recContains(data2, root.getRight());
		}

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
