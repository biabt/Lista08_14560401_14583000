package ex04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import ex03.MultiSet;

public class ConjuntSet<T> implements Iterable<T> {
    private MultiSet<T> multiset;

    public ConjuntSet(MultiSet<T> m) {
        this.multiset = m;
    }

    @Override
    public Iterator<T> iterator() { // uso do iterador
        Set<T> uniqueElements = new HashSet<>(multiset.table);
        return uniqueElements.iterator();
    }
}