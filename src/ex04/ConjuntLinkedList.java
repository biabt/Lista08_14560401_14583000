package ex04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import ex03.MultiLinkedList;

public class ConjuntLinkedList<T> implements Iterable<T> {
    private MultiLinkedList<T> multiset;

    public ConjuntLinkedList(MultiLinkedList<T> m) {
        this.multiset = m;
    }

    @Override
    public Iterator<T> iterator() { // uso do iterador
        Set<T> uniqueElements = new HashSet<>(multiset.lista);
        return uniqueElements.iterator();
    }
}