package singletonpattern;

/**
 * 懒汉式（线程不安全）单例模式
 * 懒汉式，线程不安全
 * 是否 Lazy 初始化：是
 * 是否多线程安全：否
 * 实现难度：易
 * 描述：这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
 * 这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。
 */
public class LazyUnsafeSingletonObject {

    /**
     * 私有化构造函数，防止外界调用构造函数初始化对象
     */
    private LazyUnsafeSingletonObject() {
    }

    private static LazyUnsafeSingletonObject singletonObject;

    /**
     *获取唯一可用对象
     */
    public static LazyUnsafeSingletonObject getInstant() {
        if (singletonObject == null) {
            singletonObject = new LazyUnsafeSingletonObject();
        }
        return singletonObject;
    }

    public void showMsg(String msg) {
        System.out.println(msg);
    }
}
