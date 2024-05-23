package ex04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import ex03.MultiArrayList;

public class ConjuntArrayList<T> implements Iterable<T> {
    private MultiArrayList<T> multiset;

    public ConjuntArrayList(MultiArrayList<T> m) {
        this.multiset = m;
    }

    @Override
    public Iterator<T> iterator() { // uso do iterador
        Set<T> uniqueElements = new HashSet<>(multiset.lista);
        return uniqueElements.iterator();
    }
}