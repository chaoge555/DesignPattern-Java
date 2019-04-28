package mode.singleton;

//线程安全，初始化的时候需要内存（浪费内存）,饿汉模式
public class SingletonObjectSafety {
    private static SingletonObjectSafety instance = new SingletonObjectSafety();

    private SingletonObjectSafety() {
    }

    public void output() {
        System.out.println("我是SingletonObjectSafety,线程安全，初始化的时候需要内存（浪费内存");
    }

    public static SingletonObjectSafety getInstance() {
        return instance;
    }
}
