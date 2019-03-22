package pers.xin.iterator;

/**
 * MyIterable 在这里是可迭代的意思
 * 要遍历的集合的接口
 * 实现了该接口的类将成为一个可以保存多个元素的集合，就像数组一样。
 */
public interface MyIterable<T> {
    MyIterator<T> iterator();
}
