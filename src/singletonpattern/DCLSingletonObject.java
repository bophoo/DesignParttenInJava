package singletonpattern;

/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）
 * JDK 版本：JDK1.5 起
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 实现难度：较复杂
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键。
 */
public class DCLSingletonObject {

    /**
     * 私有化构造函数，防止外界调用构造函数初始化对象
     */
    private DCLSingletonObject() {
    }

    private volatile static DCLSingletonObject singletonObject;

    /**
     * 获取唯一可用对象
     */
    public static DCLSingletonObject getInstant() {
        if (singletonObject == null) {
            synchronized (DCLSingletonObject.class){
                if (singletonObject == null) {
                    singletonObject=new DCLSingletonObject();
                }
            }
        }
        return singletonObject;
    }

    public void showMsg(String msg) {
        System.out.println(msg);
    }
}
