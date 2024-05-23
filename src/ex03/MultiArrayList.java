package ex03;

import java.util.ArrayList;
import java.util.Iterator;
	
	public class MultiArrayList<T> implements Iterable<T>{
		
		public ArrayList<T> lista;
		
		public MultiArrayList(T element) {
			this.lista = new ArrayList<>();
		}
		
		public void add(T element){
			lista.add(element);
		} 
		
		public void addAll(MultiArrayList<T> m) {
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
