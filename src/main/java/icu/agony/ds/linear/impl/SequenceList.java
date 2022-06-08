package icu.agony.ds.linear.impl;

import icu.agony.ds.linear.IList;
import icu.agony.ds.util.AssertUtil;

/**
 * 线性表的顺序存储实现
 *
 * @author LiuYun
 * @version 1.0
 */
@SuppressWarnings("unchecked")
public class SequenceList<T> implements IList<T> {

    private final Object[] elements;
    private int index;

    /**
     * 构造一个存储空间为 capacity 大小的线性表
     *
     * @param capacity 容量
     */
    public SequenceList(int capacity) {
        this.elements = new Object[capacity];
        this.index = 0;
    }

    @Override
    public void clear() {
        this.index = 0;
    }

    @Override
    public boolean isEmpty() {
        return this.index == 0;
    }

    @Override
    public int length() {
        return this.index;
    }

    @Override
    public void add(T value) {
        this.elements[this.index++] = value;
    }

    @Override
    public T get(int index) {
        AssertUtil.isTrue(index >= 0 && index < this.index, "index超出当前索引");
        return (T) this.elements[index];
    }

    @Override
    public void insert(int index, T value) {
        AssertUtil.isTrue(this.index != this.elements.length, "顺序表已满");
        AssertUtil.isTrue(index >= 0 && index < this.index, "index超出当前索引");
        for (int i = this.index; i > index; i--) {
            this.elements[i] = this.elements[i - 1];
        }
        this.elements[index] = value;
        this.index++;
    }

    @Override
    public void remove(int index) {
        for (int i = index; i < this.index - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.index--;
    }

    @Override
    public int indexOf(T value) {
        int index = -1;
        while (++index  < this.index) {
            if (this.elements[index].equals(value)) {
                return index;
            }
        }
        return -1;
    }

    @Override
    public void display() {
        for (int i = 0; i < this.index; i++) {
            System.out.println(this.elements[i]);
        }
    }
}
