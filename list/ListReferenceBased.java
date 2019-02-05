/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;


public class ListReferenceBased<T> implements ListInterface<T> {
    
    private Node head = null;
    private int numItems = 0;
    

    @Override
    public boolean isEmpty() {
        return numItems == 0;
    }

    @Override
    public int size() {
        return numItems;
    }
    
    @Override
    public void add(T item) {
    	numItems++;
    	if (head == null) {
    		head = new Node(item);
    		return;
    	}
    	Node curr = head;
        while (curr.getNextNode() != null) curr = curr.getNextNode();
        curr.setNextNode(new Node(item));
    }

    @Override
    public void add(int index, T item) {
    	
    	if (index < 0 || index > numItems) throw new IndexOutOfBoundsException();
    	
    	numItems++;
    	if (index == 0) {
    		head = new Node(item);
    		return;
    	}
    	Node curr = head;
    	for (int i = 0; i < index - 1; i++) curr = curr.getNextNode();
    	Node newNode = new Node(item);
    	newNode.setNextNode(curr.getNextNode());
    	curr.setNextNode(newNode);
    }

    @Override
    public void remove(int index) {
    	
    	if (index < 0 || index >= numItems) throw new IndexOutOfBoundsException();
    	
    	numItems--;
    	if (index == 0) {
    		head = head.getNextNode();
    		return;
    	}
    	Node curr = head;
        for (int i = 0; i < index - 1; i++) curr = curr.getNextNode();
        curr.setNextNode(curr.getNextNode().getNextNode());
    }

    @Override
    public T get(int index) {
    	
    	if (index < 0 || index >= numItems) throw new IndexOutOfBoundsException();
    	
    	Node curr = head;
        for (int i = 0; i < index; i++) curr = curr.getNextNode();
        return curr.getData();
    }

    @Override
    public void removeAll() {
    	numItems = 0;
        head = null;
    }
    
    public void show() {
    	Node curr = head;
    	while (curr != null) {
    		System.out.printf("%s ", curr.getData());
    		curr = curr.getNextNode();
    	}
    	System.out.println();
    }
    
    private class Node {

        private T data;
        private Node next;

        public Node(T dataPortion) {
            data = dataPortion;
            next = null;
        }
        public Node(T dataPortion, Node nextNode) {
            data = dataPortion;
            next = nextNode;
        }
        
        public T getData(){
            return data;
        }
        public void setData(T dataPortion) {
            data = dataPortion;
        }

        public Node getNextNode() {
            return next;
        }
        public void setNextNode(Node nextNode){
            next = nextNode;
        }

    }
}
