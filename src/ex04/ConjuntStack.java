package ex04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import ex03.MultiStack;

public class ConjuntStack<T> implements Iterable<T> {
    private MultiStack<T> multiset;

    public ConjuntStack(MultiStack<T> m) {
        this.multiset = m;
    }

    @Override
    public Iterator<T> iterator() { // uso do iterador
        Set<T> uniqueElements = new HashSet<>(multiset.pilha);
        return uniqueElements.iterator();
    }
}