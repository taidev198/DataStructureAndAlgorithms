package com.taidev198.DataStructure.Tree;

/**
 * @author traig on 7/22/2018.
 * @project DataStructure
 */
public class AbstractTree<E> implements Tree<E> {
    @Override
    public boolean isInternal(Position<E> p) throws IllegalArgumentException {
        return numChildren(p) >0;
    }

    @Override
    public boolean isExternal(Position<E> p) throws IllegalArgumentException {
        return numChildren(p) == 0;
    }

    @Override
    public boolean isRoot(Position<E> p) throws IllegalArgumentException {
        return p == root();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }
}
