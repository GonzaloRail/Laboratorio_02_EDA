import java.util.ArrayList;

public class Ejercicio4_2{
    public static void main (String args[]){
        Node<String> nodo2 = new Node<String>("Nodo B");
	
	System.out.println(nodo2);

	Node<String> nodo = new Node <String>("Nodo A", nodo2);

	System.out.println(nodo);
	
	Node <Integer> nodoNum2 = new Node<>(2);
	Node <Integer> nodoNum = new Node<>(1, nodoNum2);

	List<Integer> mylist = new List<Integer>(nodoNum);
	mylist.push(nodoNum2);

	System.out.println(mylist);

	System.out.println("Metodo para hallar numero de Elementos: "+ mylist.size());
	System.out.println("La lista esta vacia?: "+mylist.isEmpty());
	System.out.println("La lista contiene a nodo2?"+mylist.contains(nodoNum2));
	System.out.println("La lista contiene a nodo4?"+mylist.contains("nodo4"));
    }
}

public class List <T>{
    private Node<T> root;
	private ArrayList <Node<T>> list = new ArrayList<>();
                
    	public List(Node <T> root)  {
		this.root = root;
		list.add(root);
	}

	public void setRoot(Node<T> root) {
		this.root = root;
	}

	public Node<T> getRoot() {
		return root;
	}

	public void push (Node <T> node) {
		list.add(node);
	}

	public String toString() {
		String info = "";

		for(Node<T> nodo : list) {
			info += "\n\t" + nodo.toString();
		}

		return info;
	}
	public int size(){
		return list.size();
	}
	public boolean isEmpty(){
		if(list.size()==0)
			return true;
		else
			return false;
	}
	public boolean contains(Object a){
		boolean valor=false;
		int i=0;
		for (i=0;i<list.size();i++){
			if(list.get(i)==a){
				valor=true;
			}
		}
		return valor;

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

