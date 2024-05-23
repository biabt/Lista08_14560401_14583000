package ex03;
import java.util.Iterator;
import java.util.Stack;
	
	public class MultiStack<T> implements Iterable<T>{
		
		public Stack<T> pilha;
		
		public MultiStack(T element) {
			this.pilha = new Stack<>();
		}
		
		public void add(T element){
			pilha.push(element);
		} 
		
		public void addAll(MultiLinkedList<T> m) {
			for(T elem: m) {
	        	pilha.push(elem);
	        }
	    }
		
		public boolean equals(MultiLinkedList<T> m) {
			for(T elem: m) {
	        	if(pilha.search(elem) < 0) return false;
	        }
			return true;
		}
		
		@Override
		public Iterator<T> iterator() {
			return pilha.iterator();
		}

}