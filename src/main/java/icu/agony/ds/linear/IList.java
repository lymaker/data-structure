package icu.agony.ds.linear;

/**
 * 线性表的标准
 *
 * @author LiuYun
 * @version 1.0
 */
public interface IList<T> {
    /**
     * 清空
     */
    void clear();

    /**
     * 判断线性表是否为空
     *
     * @return 空表 -> true
     */
    boolean isEmpty();

    /**
     * 返回线性表的长度
     *
     * @return length
     */
    int length();

    /**
     * 添加一个元素（value）
     *
     * @param value 元素
     */
    void add(T value);

    /**
     * 获取指定索引（index）的值
     *
     * @param index 索引，取值范围 0 <= i <= length() - 1
     * @return 索引的值
     */
    T get(int index);

    /**
     * 在索引（index）前插入元素（value）
     *
     * @param index 索引
     * @param value 元素
     */
    void insert(int index, T value);

    /**
     * 删除索引（index）的元素
     *
     * @param index 索引，取值范围 0 <= i <= length() - 1
     */
    void remove(int index);

    /**
     * 返回线性表中首次出现指定元素（value）的索引
     *
     * @param value 元素
     * @return 元素对应的索引，如果线性表不包含指定元素（value）则返回 -1
     */
    int indexOf(T value);

    /**
     * 输出线性表中各个元素的值
     */
    void display();
}
