package org.example;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class Bag<T> implements Container<T> {

    ArrayList<T> Fruit;
    public Bag(){
        super();
        Fruit = new ArrayList<T>();
    }

    @Override
    public boolean isEmpty() {
        return Fruit.isEmpty();
    }

    @Override
    public int size() {
        return Fruit.size();
    }

    @Override
    public void add(T item) {
    Fruit.add(item);
    }

    @Override
    public Iterator<T> iterator() {
        return Fruit.iterator();
    }
}
