import java.util.ArrayList;

public class Ejercicio4_2{
    public static void main (String args[]){
        Node<String> nodo2 = new Node<String>("Nodo B");
	
	System.out.println(nodo2);

	Node<String> nodo = new Node <String>("Nodo A", nodo2);

	System.out.println(nodo);
	Node <Integer> nodo3= new Node<>(3);
	Node <Integer> nodoNum2 = new Node<>(2,nodo3);
	Node <Integer> nodoNum = new Node<>(1, nodoNum2);
	Node <Integer> nodo4 = new Node<>(4,nodo3);
	List<Integer> mylist = new List<Integer>(nodoNum);
	mylist.push(nodoNum2);

	System.out.println(mylist);

	System.out.println("Metodo para hallar numero de Elementos: "+ mylist.size());
	System.out.println("La lista esta vacia?: "+mylist.isEmpty());
	System.out.println("La lista contiene a nodo2?"+mylist.contains(nodoNum2));
	System.out.println("La lista contiene a nodo4?"+mylist.contains("nodo4"));
	System.out.println("Elimina el nodo2 e imprimelo");
	mylist.remove(nodoNum2);
	System.out.println(mylist);
	System.out.println("Ahora agrega 2 nodos e imprimelos");
	mylist.push(nodoNum2);
	mylist.push(nodo3);
	System.out.println(mylist);
	System.out.println("Ahora elimina la lista");
	mylist.clear();
	System.out.println("La lista esta vacia?: "+mylist.isEmpty());
	mylist.push(nodoNum);
	mylist.push(nodoNum2);
	mylist.push(nodo3);
	System.out.println("Recupera la list y imprime el 3er objeto: "+mylist.get(2));
	System.out.println("Ahora cambia el 2 elmento por el nodo4: ");
	mylist.set(1,nodo4);
	System.out.println(mylist);
	System.out.println("Elimina el nodo 3 e imprimelo");
	mylist.remove(2);
	System.out.println(mylist);
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
	public void remove(Object a){
		for (int i=0;i<list.size();i++){
			if(list.get(i)==a){
				list.remove(i);
			}
		}
	}
	public void remove(int a){
		if(a<list.size())
			list.remove(a);
		else
			System.out.println("NO existe el elemnto en la posicion "+a);
	}
	public void clear(){
		list.clear();
	}
	public Object get(int i){
		return list.get(i);
	}
	public Object set(int i,Node<T> a){
		return list.set(i,a);
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

