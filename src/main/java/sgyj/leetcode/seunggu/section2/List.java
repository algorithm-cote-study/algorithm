package sgyj.leetcode.seunggu.section2;

public interface List<E> {

    boolean add(E data);

    int size();

    E get(int index);

    boolean add(int index, E data);

}