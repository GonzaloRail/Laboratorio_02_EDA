public class Ejercicio4_2{
    public static void main (String args[]){
        Node<String> nodo2 = new Node<String>("Nodo B");
	
	System.out.println(nodo2);

	Node<String> nodo = new Node <String>("Nodo A", nodo2);

	System.out.println(nodo);
    }
}

public class List <T>{
        private Node<T> root;
                
    	public List(Node <T> root)  {
		this.root = root;
	}

	public void setRoot(Node<T> root) {
		this.root = root;
	}

	public Node<T> getRoot() {
		return root;
	}
	
}

public class Node <T> {
        private T data;
        private Node<T> nextNode;

	public Node(T data) {
		this.data = data;
		this.nextNode = null;
	}

        public Node(T data, Node<T> nextNode){
                this.data = data;
		this.nextNode = nextNode;
	}

	public void setData(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}

	public Node<T> getNextNode() {
		return nextNode;
	}

	public String toString() {
		if (nextNode == null) {
			return "Info: " + getData();
		}
		else {
			return "Info: " + getData() + ", the next node is: " + nextNode.getData();	
		}
	}
}

