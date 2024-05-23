package ex03;
import java.util.LinkedList;
import java.util.Iterator;
	
	public class MultiLinkedList<T> implements Iterable<T> {
		
		public LinkedList<T> lista;
		
		public MultiLinkedList(T element) {
			this.lista = new LinkedList<>();
		}
		
		public void add(T element){
			lista.add(element);
		} 
		
		public void addAll(MultiLinkedList<T> m) {
	        for(T elem: m) {
	        	lista.add(elem);
	        }
	    }
		
		public boolean equals(MultiLinkedList<T> m) {
			for(T elem: m) {
	        	if(!lista.contains(elem)) return false;
	        }
			return true;
		}

		@Override
		public Iterator<T> iterator() {
			return lista.iterator();
		}

}

