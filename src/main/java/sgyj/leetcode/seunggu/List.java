package sgyj.leetcode.seunggu;

public interface List<E> {

    boolean add(E data);

    int size();

    E get(int index);

    boolean add(int index, E data);

}