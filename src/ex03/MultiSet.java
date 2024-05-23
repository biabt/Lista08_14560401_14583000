package ex03;
import java.util.HashSet;
import java.util.Iterator;
	
	public class MultiSet<T> implements Iterable<T> {
		
		public HashSet<T> table;
		
		public MultiSet(T element) {
			this.table = new HashSet<>();
		}
		
		public void add(T element){
			table.add(element);
		} 
		
		public void addAll(MultiSet<T> m) {
	        table.addAll(m.table);
	    }
		
		public boolean equals(MultiSet<T> m) {
			for(T elem: m) {
	        	if(table.contains(elem)) return false;
	        }
			return true;
		}
		
		@Override
		public Iterator<T> iterator() {
			return table.iterator();
		}

}
